// 函数: sub_d6b4c
// 地址: 0xd6b4c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == 0)
    return 0

int32_t* r9 = arg3
int32_t i_1 = zx.d(*(arg1 + 0x2e)) + 1
int32_t result

while (true)
    int32_t i = i_1 - 1
    
    if (i s< 1)
        uint32_t r4_1
        
        if (zx.d(*(arg1 + 0x2f)) != 0)
            r4_1 = 0
            int32_t r7_1 = *(*arg1 + 0x1c)
            
            while (sub_d7cc4(*(r7_1 + (r4_1 << 3)), arg2) == 0)
                r4_1 += 1
                
                if (r4_1 u>= zx.d(*(arg1 + 0x2f)))
                    goto label_d6c60
            
            goto label_d6c88
        
    label_d6c60:
        result = 0
        
        if (sub_d6b4c(arg1[2], arg2, r9, 0) != 0)
            uint32_t r0_19
            r0_19, r9 = sub_d3d40(arg1, arg2, r9)
            r4_1 = r0_19
        label_d6c88:
            result = 8
            r9[4] = 0xffffffff
            r9[5] = 0xffffffff
            *r9 = 8
            r9[2] = r4_1
        
        break
    
    bool cond:0_1 = sub_d7cc4(arg2, 
        *(*(*arg1 + 0x18) + sx.d(*(**(arg1[3] + 0x40) + ((i_1 + arg1[0xa]) << 1) - 4)) * 0xc)) == 0
    i_1 = i
    
    if (not(cond:0_1))
        result = 7
        r9[4] = 0xffffffff
        r9[5] = 0xffffffff
        *r9 = 7
        r9[2] = i - 1
        
        if (arg4 != 0)
            break
        
        void* r0_8 = &arg1[4]
        
        do
            r0_8 = *r0_8
        while (i s<= zx.d(*(r0_8 + 8)))
        
        *(r0_8 + 9) = 1
        return 7

return result
