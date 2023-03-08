dependencies = [
            //network
//            "retrofit"                     : "com.squareup.retrofit2:retrofit:${version["retrofitSdkVersion"]}",
"retrofit-converter-gson"      : "com.squareup.retrofit2:converter-gson:${version["retrofitSdkVersion"]}",
"retrofit-adapter-rxjava"      : "com.squareup.retrofit2:adapter-rxjava:${version["retrofitSdkVersion"]}",
//            "retrofit-adapter-rxjava2"     : "com.squareup.retrofit2:adapter-rxjava2:${version["retrofitSdkVersion"]}",
"glide"                        : "com.github.bumptech.glide:glide:${version["glideSdkVersion"]}",
"glide-compiler"               : "com.github.bumptech.glide:compiler:${version["glideSdkVersion"]}",
//            "glide-loader-okhttp3"         : "com.github.bumptech.glide:okhttp3-integration:${version["glideSdkVersion"]}",
//            "picasso"                      : "com.squareup.picasso:picasso:2.5.2",
"logging-interceptor"          : "com.squareup.okhttp3:logging-interceptor:3.5.0",//okhttp拦截器

            //rx1
            "rxandroid"                    : "io.reactivex:rxandroid:1.2.1",
            "rxjava"                       : "io.reactivex:rxjava:1.3.0",
            "rxlifecycle"                  : "com.trello:rxlifecycle:${version["rxlifecycleSdkVersion"]}",
            "rxlifecycle-components"       : "com.trello:rxlifecycle-components:${version["rxlifecycleSdkVersion"]}",
            "rxcache"                      : "com.github.VictorAlbertos.RxCache:runtime:1.7.0-1.x",
            "rxcache-jolyglot-gson"        : "com.github.VictorAlbertos.Jolyglot:gson:0.0.4",
            "rxbinding-recyclerview-v7"    : "com.jakewharton.rxbinding:rxbinding-recyclerview-v7:1.0.1",
            "rxpermissions"                : "com.tbruyelle.rxpermissions:rxpermissions:0.9.4@aar",
            "rxerrorhandler"               : "me.jessyan:rxerrorhandler:1.0.1",

            //rx2
            "rxandroid2"                   : "io.reactivex.rxjava2:rxandroid:3.0.0",
            "rxjava2"                      : "io.reactivex.rxjava2:rxjava:3.0.4",
            "rxlifecycle2"                 : "com.trello.rxlifecycle2:rxlifecycle:${version["rxlifecycle2SdkVersion"]}",
            "rxlifecycle2-android"         : "com.trello.rxlifecycle2:rxlifecycle-android:${version["rxlifecycle2SdkVersion"]}",
            "rxlifecycle2-components"      : "com.trello.rxlifecycle2:rxlifecycle-components:${version["rxlifecycle2SdkVersion"]}",
            "rxcache2"                     : "com.github.VictorAlbertos.RxCache:runtime:1.8.3-2.x",
            "rxpermissions2"               : "com.github.tbruyelle:rxpermissions:0.10.2",
            "rxerrorhandler2"              : "me.jessyan:rxerrorhandler:2.1.1",
            "rxbinding"                    : "com.jakewharton.rxbinding2:rxbinding:2.1.1",

            //tools
            "dagger2"                      : "com.google.dagger:dagger:${version["dagger2SdkVersion"]}",
            "dagger2-android"              : "com.google.dagger:dagger-android:${version["dagger2SdkVersion"]}",
            "dagger2-android-support"      : "com.google.dagger:dagger-android-support:${version["dagger2SdkVersion"]}",
            "dagger2-compiler"             : "com.google.dagger:dagger-compiler:${version["dagger2SdkVersion"]}",
            "dagger2-android-processor"    : "com.google.dagger:dagger-android-processor:${version["dagger2SdkVersion"]}",
//            "androideventbus"              : "org.simple:androideventbus:1.0.5.1",
"eventbus"                     : "org.greenrobot:eventbus:3.1.1",
"otto"                         : "com.squareup:otto:1.3.8",
"gson"                         : "com.google.code.gson:gson:2.8.5",
"multidex"                     : "com.android.support:multidex:1.0.3",
"javax.annotation"             : "javax.annotation:jsr250-api:1.0",
"arouter"                      : "com.alibaba:arouter-api:1.3.1",
"arouter-compiler"             : "com.alibaba:arouter-compiler:1.1.4",
"progressmanager"              : "me.jessyan:progressmanager:1.5.0",
"retrofit-url-manager"         : "me.jessyan:retrofit-url-manager:1.4.0",
"lifecyclemodel"               : "me.jessyan:lifecyclemodel:1.0.1",

            //test
            "junit"                        : "junit:junit:4.12",
            "androidJUnitRunner"           : "android.support.test.runner.AndroidJUnitRunner",
            "runner"                       : "com.android.support.test:runner:1.0.1",
            "espresso-core"                : "com.android.support.test.espresso:espresso-core:${version["espressoSdkVersion"]}",
            "espresso-contrib"             : "com.android.support.test.espresso:espresso-contrib:${version["espressoSdkVersion"]}",
            "espresso-intents"             : "com.android.support.test.espresso:espresso-intents:${version["espressoSdkVersion"]}",
            "mockito-core"                 : "org.mockito:mockito-core:1.+",
            "timber"                       : "com.jakewharton.timber:timber:4.7.1",
            "logger"                       : "com.orhanobut:logger:2.2.0",
            "canary-debug"                 : "com.squareup.leakcanary:leakcanary-android:${version["canarySdkVersion"]}",
//            "canary-release"               : "com.squareup.leakcanary:leakcanary-android-no-op:${version["canarySdkVersion"]}",
"umeng-analytics"              : "com.umeng.analytics:analytics:6.0.1",

            "jessyan:arms"                 : "me.jessyan:arms:2.5.2",
            //debug 数据库相关
            "pandora"                      : "com.github.whataa:pandora:v1.0.1",
            "pandora-no-op"                : "com.github.whataa:pandora-no-op:v1.0.1",
            "BaseRecyclerViewAdapterHelper": "com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.50",
            //dialog
//            "dialogs-core"                 : 'com.afollestad.material-dialogs:core:3.1.0',
//            "dialogs-color"                : 'com.afollestad.material-dialogs:color:3.1.0',
//            "dialogs-datetime"             : 'com.afollestad.material-dialogs:datetime:3.1.1',
"dialogs-core"                 : 'com.afollestad.material-dialogs:core:0.9.6.0',
"material-calendarview"        : "com.prolificinteractive:material-calendarview:1.4.3",
"fast-json"                    : "com.alibaba:fastjson:1.2.60",
//fragment管理库
"fragmentationx"               : 'me.yokeyword:fragmentationx:1.0.1',
//底部导航栏
"BottomNavigationViewEx"       : 'com.github.ittianyu:BottomNavigationViewEx:2.0.4',
//androidX基础库
"appcompat"                    : 'androidx.appcompat:appcompat:1.2.0',
"preference"                   : 'androidx.preference:preference:1.1.0',
"core-ktx"                     : 'androidx.core:core-ktx:1.1.0',
"constraintlayout"             : 'androidx.constraintlayout:constraintlayout:2.0.1',
"material"                     : 'com.google.android.material:material:1.1.0-alpha09',
//揭示效果布局，可以指定2个子布局，以圆形揭示效果切换选中状态，主要是为了做-收藏爱心的效果
"RevealLayout"                 : 'com.github.goweii:RevealLayout:1.1.1',
//图片加载的glide库
"arms-imageloader"             : 'me.jessyan:arms-imageloader-glide:2.5.2',
"smartRefresh"                 : "com.scwang.smartrefresh:SmartRefreshLayout:1.0.3",
"smartRefreshHeader"           : "com.scwang.smartrefresh:SmartRefreshHeader:1.0.3",
//页面管理框架
"loadsir"                      : 'com.kingja.loadsir:loadsir:1.3.6',
//tablayout指示器
"Magicindicator"               : 'com.github.hackware1993:MagicIndicator:1.6.0',
//webview 库
//            "agentweb"                     : 'com.just.agentweb:agentweb:4.1.3',
//            "filechooser"                  : 'com.just.agentweb:filechooser:4.1.3',
//            "Downloader"                   : 'com.download.library:Downloader:4.1.3',
"agentweb"                     : "com.just.agentweb:agentweb-androidx:4.1.4",// (必选)
"filechooser"                  : "com.just.agentweb:filechooser-androidx:4.1.4",// (非必选)
"downloader"                   : "com.download.library:downloader-androidx:4.1.4",// (非必选)

            //标签库
            "flow-layout"                  : 'com.hyman:flowlayout-lib:1.1.2',
            //高性能通用 key-value 组件
            "mmkv"                         : 'com.tencent:mmkv:1.0.23',
            "hotfix"                       : 'com.aliyun.ams:alicloud-android-hotfix:3.2.14',
            //banner
            "banner"                       : 'com.youth.banner:banner:2.1.0',
            //星形控件
            "materialratingbar"            : 'me.zhanghai.android.materialratingbar:library:1.3.2',
            //convenientbanner
            "convenientbanner"             : 'com.bigkoo:convenientbanner:2.1.5',
            // 基础依赖包，必须要依赖
            "immersionbar"                 : 'com.gyf.immersionbar:immersionbar:3.0.0',
            // fragment快速实现（可选）
            "immersionbar-components"      : 'com.gyf.immersionbar:immersionbar-components:3.0.0',
            // kotlin扩展（可选）
            "immersionbar-ktx"             : 'com.gyf.immersionbar:immersionbar-ktx:3.0.0',
            "verticalviewpager"            : 'com.github.castorflex.verticalviewpager:library:19.0.1',
            "circleimageview"              : 'de.hdodenhof:circleimageview:2.2.0',
            //shadow
            "ShadowLayout"                 : 'com.github.lihangleo2:ShadowLayout:2.0.1',
            //glide-transformations
            "glide-transformations"        : 'jp.wasabeef:glide-transformations:4.1.0',
            //圆形控件
            "circleimage"                  : "de.hdodenhof:circleimageview:2.2.0",
            //图片选择器
            "MultiImageSelector"           : "com.github.lovetuzitong:MultiImageSelector:1.2",
            //图片压缩
            "Luban"                        : "top.zibin:Luban:1.1.8",
            //高德地图
            "location"                     : "com.amap.api:location:latest.integration",
            "search"                       : "com.amap.api:search:latest.integration",
            "3dmap"                        : "com.amap.api:3dmap:latest.integration",
            //微信
            "wx"                           : "com.tencent.mm.opensdk:wechat-sdk-android-without-mta:+",
            //图片查看器
            "PhotoView"                    : "com.github.chrisbanes:PhotoView:2.3.0",
            //Mpchart
            "mpchart"                      : "com.github.PhilJay:MPAndroidChart:v3.1.0",
            "FastBleLib"                   : "com.clj.fastble:FastBleLib:2.3.4",
            "PickerView"                   : "com.contrarywind:Android-PickerView:4.1.9",
            "richtext"                     : "com.zzhoujay.richtext:richtext:3.0.8",
            "richtml"                      : "com.zzhoujay:html:1.0.2",
            "update-app"                   : "com.qianwen:update-app:3.5.2",
            "okgo"                         : "com.lzy.net:okgo:3.0.4",
            "NiceImageView"                : "com.github.SheHuan:NiceImageView:1.0.5",
            "apache"                       : "org.apache.commons:commons-lang3:3.8.1",
            "qiniu-android-sdk"            : 'com.qiniu:qiniu-android-sdk:7.3.11',
            //二维码生成扫描器
            "ZXing"                        : "cn.bingoogolapple:bga-qrcode-zxing:1.3.7",
            "zxing:core"                   : "com.google.zxing:core:3.3.3",
            "ZBar"                         : "cn.bingoogolapple:bga-qrcode-zbar:1.3.7",
            //友盟统计
            "umsdk-analytics"              : "com.umeng.umsdk:analytics:8.0.0",
            "umsdk-common"                 : "com.umeng.umsdk:common:2.0.0",
            //跑马灯
            "MarqueeView"                  : "com.sunfusheng:MarqueeView:1.4.1",
            //银行卡号识别
//            "scanCard"                     : "io.card:android-sdk:5.5.1",
"Scanner"                      : "com.shouzhong:Scanner:1.1.2-beta1",
"ScannerBankCardLib"           : "com.shouzhong:ScannerBankCardLib:1.0.3",
"hwangjr"                      : "com.hwangjr.rxbus:rxbus:2.0.0",
//webView
//            "agentweb"                     : "com.just.agentweb:agentweb:4.1.2",

            //极光
            "jpush"                        : "cn.jiguang.sdk:jpush:3.6.0",
            "jcore"                        : "cn.jiguang.sdk:jcore:2.3.4",

            //解决Appbarlayout快速滑动导致的回弹问题
            "AppbarLayoutBehavior"         : "com.github.yuruiyin:AppbarLayoutBehavior:v1.0.2",
            //环形进度条
            "CircleProgress"               : "com.github:CircleProgress:1.0.1",
            //表单
            "SmartTable"                   : "com.github.huangyanbin:SmartTable:2.2.0",
            //引导蒙层
            "guideview"                    : "com.binioter:guideview:1.0.0",
            //im菜单切换
            "panelSwitchHelper"            : 'com.effective.android:panelSwitchHelper-androidx:1.3.6',
            "eva_star"                     : "com.github.ome450901:SimpleRatingBar:1.5.0",
            //圆角图片
            "roundedimageview"             : 'com.makeramen:roundedimageview:2.3.0',
//            "permissionx"                  : 'com.permissionx.guolindev:permissionx:1.4.0',
"permissionx"                  : 'com.guolindev.permissionx:permissionx:1.6.1',
//            "PictureSelector"              : 'com.github.LuckSiege.PictureSelector:picture_library:v2.2.4',
"PictureSelector"              : 'com.github.LuckSiege.PictureSelector:picture_library:v2.5.8',
//            "PictureSelector"              : 'com.github.LuckSiege.PictureSelector:picture_library:v2.7.3-rc06',
"utilcodex"                    : 'com.blankj:utilcodex:1.30.6',
"statusbarutil"                : 'com.jaeger.statusbarutil:library:1.5.1',
"constraint"                   : 'androidx.constraintlayout:constraintlayout:2.0.4',
"smarttablayout"               : 'com.ogaclejapan.smarttablayout:library:1.6.1@aar',
//            "joda-time"                : 'joda-time:joda-time:2.10.1',

            //IJK 只引入需要的部分（出去x86）
//            "GSYVideoPlayer_java"          : "com.shuyu:gsyVideoPlayer-java:7.1.5",
//            "GSYVideoPlayer_armv5"         : "com.shuyu:gsyVideoPlayer-armv5:7.1.5",
//            "GSYVideoPlayer_armv7"         : "com.shuyu:gsyVideoPlayer-armv7a:7.1.5",
//            "GSYVideoPlayer_arm64"         : "com.shuyu:gsyVideoPlayer-arm64:7.1.5",
"circleprogress"               : "com.github.lzyzsd:circleprogress:1.2.4",
"ToastUtils"                   : "com.github.getActivity:ToastUtils:10.0",
"alicloud-android-hotfix"      : "com.aliyun.ams:alicloud-android-hotfix:3.3.0",
"camera-core"                  : "androidx.camera:camera-core:1.0.0-beta03",
"camera-camera2"               : "androidx.camera:camera-camera2:1.0.0-beta03",
//            "keeplive"                     : "com.fanjun:keeplive:1.1.22",
//            "hellodaemon"                  : "com.xdandroid:hellodaemon:1.2.2",
//            "bugly_crashreport"            : "com.tencent.bugly:crashreport:latest.release",
//            "bugly_nativecrashreport"      : "com.tencent.bugly:nativecrashreport:latest.release",
"consecutivescroller"          : "com.github.donkingliang:ConsecutiveScroller:4.6.1",
"lottie"                       : 'com.airbnb.android:lottie:4.1.0',
"qqopen"                       : 'com.tencent.tauth:qqopensdk:3.52.0',
"videocache"                   : 'com.danikula:videocache:2.7.0',
"ShapeView"                    : 'com.github.getActivity:ShapeView:6.0',
"lifecycle-runtime-ktx"        : "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0",

            //view
            "autolayout"                   : "com.zhy:autolayout:1.4.5",
            "butterknife"                  : "com.jakewharton:butterknife:${version["butterknifeSdkVersion"]}",
            "butterknife-compiler"         : "com.jakewharton:butterknife-compiler:${version["butterknifeSdkVersion"]}",
            "android-pickerview"           : "com.contrarywind:Android-PickerView:4.1.9",
            "photoview"                    : "com.github.chrisbanes.photoview:library:1.2.3",
//            "numberprogressbar"            : "com.daimajia.numberprogressbar:library:1.2@aar",
//            "nineoldandroids"              : "com.nineoldandroids:library:2.4.0",
//            "paginate"                     : "com.github.markomilos:paginate:0.5.1",
//            "vlayout"                      : "com.alibaba.android:vlayout:1.1.0@aar",
//适配
"autosize"                     : "me.jessyan:autosize:1.1.2",
]
