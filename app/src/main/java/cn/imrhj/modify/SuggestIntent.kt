package cn.imrhj.modify

import cn.imrhj.modify.data.CardInfo

/**
 * Created by rhj on 2017/8/10.
 */
//class SuggestIntent {
    public val bili = "tv.danmaku.bili"
    public val cloudmusic = "com.netease.cloudmusic"
    public val coolapk = "com.coolapk.market"
    public val dianping = "com.dianping.v1"
    public val douban = "com.douban.frodo"
    public val jingdong = "com.jingdong.app.mall"
    public val tb = "com.taobao.taobao"
    public val wc = "com.wacai365"
    public val wx = "com.tencent.mm"
    public val youdaonote = "com.youdao.note"
    public val zfb = "com.eg.android.AlipayGphone"

    fun getSuggestIntentByPkName(paramString: String) : List<CardInfo>? {
//        val lists = ArrayList<CardInfo>()
        var shutcutList = ArrayList<CardInfo>()
        if (wx == paramString) {
            shutcutList.add(CardInfo(wx, "com.tencent.mm.plugin.mall.ui.MallIndexUI", "我的钱包"))
            shutcutList.add(CardInfo(wx, "com.tencent.mm.plugin.sns.ui.En_424b8e16", "朋友圈"))
            shutcutList.add(CardInfo(wx, "com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI", "付款码"))
            shutcutList.add(CardInfo(wx, "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "扫一扫"))
            return shutcutList
        } else if (zfb == paramString) {
            shutcutList.add(CardInfo(zfb, "com.alipay.mobile.bill.list.ui.BillListActivity_", "账单"))
            shutcutList.add(CardInfo(zfb, "com.alipay.mobile.payee.ui.PayeeQRActivity_", "收钱"))
            shutcutList.add(CardInfo(zfb, "com.alipay.mobile.onsitepay9.payer.OspTabHostActivity", "付款码"))
            shutcutList.add(CardInfo(zfb, "com.alipay.mobile.scan.as.main.MainCaptureActivity", "扫一扫"))
            return shutcutList
        } else if (bili == paramString) {
            shutcutList.add(CardInfo(bili, "tv.danmaku.bili.MainActivity", "哔哩哔哩"))
            shutcutList.add(CardInfo(bili, "tv.danmaku.bili.ui.rank.RankPagerActivity", "排行榜"))
            shutcutList.add(CardInfo(bili, "tv.danmaku.bili.ui.qrcode.QRcodeCaptureActivity", "扫一扫"))
            shutcutList.add(CardInfo(bili, "tv.danmaku.bili.ui.videodownload.VideoDownloadListActivity", "我的下载"))
            return shutcutList
        } else if (cloudmusic == paramString) {
            shutcutList.add(CardInfo(cloudmusic, "com.netease.cloudmusic.activity.DailyRcmdMusicActivity", "每日推荐"))
            return shutcutList
        }
        return null
    }

//}