// 函数: sub_c841c
// 地址: 0xc841c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = arg1[4]
void* const var_24 = nullptr
int32_t r9 = (&data_1d78b4)[*(arg2 + 8) & 0xf]

if ((zx.d(*(r2 + 0x12)) & 1) != 0)
    void* r0_4 = **r2
    uint32_t r3_1 = zx.d(*(r0_4 + 6))
    void* const r0_8
    
    if (r3_1 != 0)
        int32_t r4_1 = 0
        
        while (*(*(r0_4 + 0x10 + (r4_1 << 2)) + 8) != arg2)
            r4_1 += 1
            
            if (r4_1 u>= r3_1)
                goto label_c8498
        
        void* r1_2 = *(*(*(r0_4 + 0xc) + 0x1c) + (r4_1 << 3))
        r0_8 = &data_1bfd31
        
        if (r1_2 != 0)
            r0_8 = r1_2 + 0x10
        
        var_24 = r0_8
        goto label_c8520
    
label_c8498:
    int32_t r4_2 = r2[1]
    int32_t r7_2 = r2[6]
    
    if (r7_2 u< r4_2)
        int32_t r3_2 = r7_2
        
        while (arg2 != r3_2)
            r3_2 += 0x10
            
            if (r3_2 u>= r4_2)
                goto label_c850c
        
        void* r0_5 = *(r0_4 + 0xc)
        
        if (sub_c8570(r0_5, 0xffffffff + ((r2[7] - *(r0_5 + 0xc)) s>> 2), (arg2 - r7_2) s>> 4, 
                &var_24) != 0)
            r0_8 = var_24
        label_c8520:
            void* const var_30 = r0_8
            int32_t var_2c = r9
            sub_c89f0(arg1, "attempt to %s %s '%s' (a %s value)", arg3)
            noreturn

label_c850c:
sub_c89f0(arg1, "attempt to %s a %s value", arg3)
noreturn
