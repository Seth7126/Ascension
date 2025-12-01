// 函数: _Z15ObfuscateStringPKcicciPc
// 地址: 0xba2dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

arg6[arg2] = 0

if (arg2 s< 1)
    return 

int32_t i

do
    int32_t r5_2 = sx.d(*arg1)
    
    if (r5_2 s>= arg3 && r5_2 s<= arg4)
        r5_2 += arg5
        
        if (r5_2 s> arg4)
            r5_2 -= arg4 - arg3 + 1
        else if (r5_2 s< arg3)
            r5_2 += arg4 - arg3 + 1
    
    *(arg6 - 1 + arg2) = r5_2.b
    i = arg2
    arg2 -= 1
    arg1 = &arg1[1]
while (i != 1)
