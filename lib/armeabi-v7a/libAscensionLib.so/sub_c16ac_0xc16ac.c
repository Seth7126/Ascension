// 函数: sub_c16ac
// 地址: 0xc16ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

FILE* stream = arg1[1]
int32_t result = 0
*arg1 = 0
int32_t r0 = getc(stream)

if (r0 == 0xffffffff)
    *arg2 = r0
else if (r0 != 0xef)
label_c175c:
    result = 0
    *arg2 = r0
    
    if (r0 == 0x23)
        int32_t i
        
        do
            i = getc(arg1[1])
            
            if (i == 0xa)
                break
        while (i != 0xffffffff)
        result = 1
        *arg2 = getc(arg1[1])
else
    int32_t r0_1 = *arg1
    *arg1 = r0_1 + 1
    *(arg1 + r0_1 + 8) = 0xef
    r0 = getc(arg1[1])
    
    if (r0 == 0xffffffff)
        *arg2 = r0
    else
        if (r0 != 0xbb)
            goto label_c175c
        
        int32_t r0_4 = *arg1
        *arg1 = r0_4 + 1
        *(arg1 + r0_4 + 8) = 0xbb
        r0 = getc(arg1[1])
        
        if (r0 != 0xffffffff)
            if (r0 == 0xbf)
                *(arg1 + *arg1 + 8) = 0xbf
                FILE* stream_1 = arg1[1]
                *arg1 = 0
                r0 = getc(stream_1)
            
            goto label_c175c
        
        *arg2 = r0

return result
