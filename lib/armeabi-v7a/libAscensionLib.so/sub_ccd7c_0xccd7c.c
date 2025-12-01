// 函数: sub_ccd7c
// 地址: 0xccd7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 == arg3)
    return 

void* r5_1 = arg2

do
    int32_t* i = *(r5_1 + 0x10)
    void* r8_1 = &i[(1 << zx.d(*(r5_1 + 7))) * 8]
    
    if (*(r5_1 + 0x1c) s< 1)
        for (; i u< r8_1; i = &i[8])
        label_cce1c:
            
            if (i[2] != 0 && sub_ccd20(arg1, i) != 0)
                uint32_t r0_9 = zx.d(i[6].b)
                i[2] = 0
                
                if ((r0_9 & 0x40) != 0 && (zx.d(*(i[4] + 5)) & 3) != 0)
                    i[6] = 0xb
    else
        int32_t r10_1 = 0
        int32_t i_1 = 0
        
        do
            int32_t* r7_1 = *(r5_1 + 0xc) + r10_1
            r10_1 += 0x10
            
            if (sub_ccd20(arg1, r7_1) != 0)
                r7_1[2] = 0
            
            i_1 += 1
        while (i_1 s< *(r5_1 + 0x1c))
        
        i = *(r5_1 + 0x10)
        
        if (i u< r8_1)
            goto label_cce1c
    
    r5_1 = *(r5_1 + 0x18)
while (r5_1 != arg3)
