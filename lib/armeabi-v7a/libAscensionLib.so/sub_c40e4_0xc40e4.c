// 函数: sub_c40e4
// 地址: 0xc40e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 == 0xffffffff)
    return 

int32_t r0_1 = *(*arg1 + 0xc)
int32_t i

do
    int32_t r3_1 = *(r0_1 + (arg2 << 2))
    *(r0_1 + (arg2 << 2)) = (r3_1 & 0xffffc03f) | ((0x40 + (arg3 << 6)) & 0x3fc0)
    i = 0xfffe0001 + (r3_1 u>> 0xe)
    
    if (i != 0xffffffff)
        i = arg2 + i + 1
    
    arg2 = i
while (i != 0xffffffff)
