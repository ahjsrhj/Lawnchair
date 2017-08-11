package cn.imrhj.modify.utils

import java.io.ByteArrayOutputStream
import java.io.DataOutputStream
import java.io.InputStream

/**
 * Created by rhj on 2017/8/10.
 */
public fun exec(paramString: String, paramBoolean: Boolean): Int {
    if (paramBoolean) {
    }

    while (true) {
        try {
            val localProcess = Runtime.getRuntime().exec("su")
            val localDataOutputStream = DataOutputStream(localProcess.outputStream)
            localDataOutputStream.writeBytes(paramString + "\n")
            localDataOutputStream.flush()
            localDataOutputStream.writeBytes("exit\n")
            localDataOutputStream.flush()
            localProcess.waitFor()
            val result = inputStream2String(localProcess.errorStream)
            if (result.isBlank() || result.contains("Error type 3")) {
                return -2
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return -1
        }

        return Runtime.getRuntime().exec(paramString).exitValue()
    }
}

fun execRooted(paramString: String): Int{
    return exec(paramString, true)
}

fun inputStream2String(paramInputStream: InputStream): String {
    val outputStream = ByteArrayOutputStream()
    do {
        var i = paramInputStream.read()
        if (i != -1) {
            outputStream.write(i)
        }
    } while (i != -1)

    return outputStream.toString()
}