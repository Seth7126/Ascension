// 函数: _ZN9ascension6CWorld16RemoveRevealCardEPN4core13CCardInstanceE
// 地址: 0xf938c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0xa14)) == 0)
    int32_t* r3_1 = *(arg1 + 0xbe4)
    int32_t r12_1 = *(arg1 + 0xbe8)
    
    if (r3_1 != r12_1)
        int32_t entry_r1
        void* r5_1
        
        if (*r3_1 == entry_r1)
            r5_1 = r3_1
        else
            bool cond:0_1
            
            do
                if (r12_1 - 0xc == r3_1)
                    return 0
                
                r5_1 = &r3_1[3]
                cond:0_1 = r3_1[3] != entry_r1
                r3_1 = r5_1
            while (cond:0_1)
        
        if (r12_1 != r5_1 + 0xc)
            __aeabi_memmove4(r5_1)
        
        *(arg1 + 0xbe8) = r5_1 + ((r12_1 - (r5_1 + 0xc)) s>> 2) * 0x800000004
        return 1

return 0
