package cn.imrhj.modify.data

import ch.deletescape.lawnchair.R

/**
 * Created by rhj on 2017/8/10.
 */
class CardInfo() {
    var className: String? = null
    var iconRes = R.drawable.ic_info_no_shadow
    var packageName: String? = null
    var titleString: String? = null

    constructor(packageName: String?, className: String?, titleString: String?, iconRes: Int) : this() {
        this.className = className
        this.iconRes = iconRes
        this.packageName = packageName
        this.titleString = titleString
    }

    constructor(packageName: String?, className: String?, titleString: String?) : this() {
        this.className = className
        this.packageName = packageName
        this.titleString = titleString
    }
}