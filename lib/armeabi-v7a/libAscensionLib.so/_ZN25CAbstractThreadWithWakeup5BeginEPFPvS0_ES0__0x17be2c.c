// 函数: _ZN25CAbstractThreadWithWakeup5BeginEPFPvS0_ES0_
// 地址: 0x17be2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

pthread_mutex_init(arg1 + 0x28, 0)
pthread_cond_init(arg1 + 0x2c, 0)
pthread_mutex_init(arg1 + 0x24, 0)
pthread_attr_init(arg1 + 0xc)
pthread_attr_setdetachstate(arg1 + 0xc, 1)
pthread_attr_setscope(arg1 + 0xc, 0)
int32_t temp0 = 0
int32_t entry_r2
uint32_t i = pthread_create(arg1 + 8, arg1 + 0xc, arg2, entry_r2)

while (i != 0)
    i u>>= 1
    temp0 += 1

uint32_t result = (0x20 - temp0) u>> 5
*(arg1 + 4) = result.b
return result
