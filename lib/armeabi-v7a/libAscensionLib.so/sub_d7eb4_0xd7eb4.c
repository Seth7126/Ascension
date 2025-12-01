// 函数: sub_d7eb4
// 地址: 0xd7eb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* i

if (arg3 u> 0x28)
    if (arg3 + 1 u>= 0xffffffee)
        sub_d14b4(arg1)
        noreturn
    
    int32_t r8_1 = *(arg1[3] + 0x38)
    int32_t var_30_1 = 0
    void* i_1
    int32_t r9_1
    i_1, r9_1 = sub_cb0b8(arg1, 0x14, arg3 + 0x11, 0)
    i = i_1
    *(i + 8) = r9_1:r8_1
    *(i_1 + 6) = 0
    __aeabi_memcpy(i_1 + 0x10, arg2, r9_1)
    *(i_1 + 0x10 + r9_1) = 0
else
    void* r7_1 = arg1[3]
    int32_t r5 = *(r7_1 + 0x38) ^ arg3
    
    if (arg3 u> arg3 u>> 5)
        uint32_t r0_1 = arg3 u>> 5
        uint32_t r3_1 = arg3
        
        do
            uint32_t r6_1 = zx.d(*(arg2 - 1 + r3_1))
            r3_1 += not.d(r0_1)
            r5 ^= (r5 << 5) + (r5 u>> 2) + r6_1
        while (r3_1 u> r0_1)
    
    int32_t r8 = *(r7_1 + 0x20)
    int32_t* r4_4 = *(r7_1 + 0x18) + (((r8 - 1) & r5) << 2)
    i = *r4_4
    
    if (i != 0)
        do
            if (r5 == *(i + 8) && *(i + 0xc) == arg3 && memcmp(arg2, i + 0x10, arg3) == 0)
                char r0_9 = *(i + 5) ^ 3
                
                if (((zx.d(*(r7_1 + 0x3c)) ^ 3) & zx.d(r0_9)) == 0)
                    *(i + 5) = r0_9
                
                goto label_d8074
            
            i = *i
        while (i != 0)
    
    if (r8 s<= 0x3ffffffe && *(r7_1 + 0x1c) u>= r8)
        sub_d7d88(arg1, r8 << 1)
        r4_4 = *(r7_1 + 0x18) + (((*(r7_1 + 0x20) - 1) & r5) << 2)
    
    int32_t var_30_2 = 0
    void* i_2
    int32_t r9_2
    i_2, r9_2 = sub_cb0b8(arg1, 4, arg3 + 0x11, r4_4)
    i = i_2
    *(i + 8) = r5
    *(i + 0xc) = r9_2
    *(i_2 + 6) = 0
    __aeabi_memcpy(i_2 + 0x10, arg2, r9_2)
    *(i_2 + 0x10 + r9_2) = 0
    *(r7_1 + 0x1c) += 1

label_d8074:
return i
