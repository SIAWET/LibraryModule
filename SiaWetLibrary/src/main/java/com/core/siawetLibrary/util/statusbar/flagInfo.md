(4.1+)SYSTEM_UI_FLAG_FULLSCREEN：隐藏状态栏，手指在屏幕顶部往下拖动，状态栏会再次出现且不会消失，另外activity界面会重新调整大小，直观感觉就是activity高度有个变小的过程。
(4.1+)SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN:状态栏一直存在并且不会挤压activity高度，状态栏会覆盖在activity之上
(4.1+)SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN配合SYSTEM_UI_FLAG_FULLSCREEN一起使用，效果使得状态栏出现的时候不会挤压activity高度，状态栏会覆盖在activity之上

(4.0+)SYSTEM_UI_FLAG_HIDE_NAVIGATION:会使得虚拟导航栏隐藏，但是由于NavigationBar是非常重要的，因此只要有用户交互（例如点击一个 button），系统就会清除这个flag使NavigationBar就会再次出现，同时activity界面会被挤压 。
(4.1+)SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION：效果使得导航栏不会挤压activity高度，导航栏会覆盖在activity之上。
(4.1+)SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION 配合 SYSTEM_UI_FLAG_HIDE_NAVIGATION 一起使用，效果使得导航栏出现的时候不会挤压activity高度，导航栏会覆盖在activity之上。
SYSTEM_UI_FLAG_IMMERSIVE配合SYSTEM_UI_FLAG_HIDE_NAVIGATION一起使用，
还记得之前使用SYSTEM_UI_FLAG_HIDE_NAVIGATION之后只要有用户交互，系统就会清除这个flag使NavigationBar就会再次出现，
和SYSTEM_UI_FLAG_IMMERSIVE一起使用之后就会使SYSTEM_UI_FLAG_HIDE_NAVIGATION必须手指在屏幕底部往上拖动NavigationBar才会出现。

SYSTEM_UI_FLAG_IMMERSIVE_STICKY配合View.SYSTEM_UI_FLAG_FULLSCREEN和
View.SYSTEM_UI_FLAG_HIDE_NAVIGATION一起使用，会使状态栏和导航栏以透明的形式出现，并且一段时间后自动消失。

SYSTEM_UI_FLAG_LAYOUT_STABLE：稳定布局，主要是在全屏和非全屏切换时，布局不要有大的变化。
一般和View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN、View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION搭配使用。（其实具体有什么用我也没搞懂）



版权声明：本文为CSDN博主「mashanshui」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/shanshui911587154/article/details/86623646