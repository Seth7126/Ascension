// 函数: sub_cbdc0
// 地址: 0xcbdc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = arg1[3]
int32_t* r4 = arg1
int32_t r1_9
void* r5_1

if (zx.d(*(r6 + 0x3e)) != 2)
    int32_t r8_1 = *(r6 + 0xa4)
    int32_t r7_1 = 0x7ffffffc
    int32_t r0_7 = (*(r6 + 0xc) * 0x51eb851f) s>> 0x20
    
    if (r8_1 s<= 0x28)
        r8_1 = 0x28
    
    if ((r0_7 s>> 6) + (r0_7 u>> 0x1f) + 1 s< __aeabi_uidiv(0x7ffffffc, r8_1))
        r7_1 = r8_1 * ((r0_7 s>> 6) + (r0_7 u>> 0x1f) + 1)
    
    r5_1 = r6 + 0x3d
    
    while (true)
        int32_t r0_11 = sub_cb648(r4)
        uint32_t r1_5 = zx.d(*r5_1)
        r7_1 -= r0_11
        
        if (r7_1 s<= 0xfffff9c0)
            if (r1_5 != 5)
                r1_9 = __aeabi_idiv(r7_1, r8_1) * 0xc8
                break
        else if (r1_5 != 5)
            continue
        
        int32_t r8_2 = *(r6 + 8)
        int32_t r10_1 = *(r6 + 0xc)
        int32_t r9_1 = *(r6 + 0x9c)
        int32_t r0_13 = (*(r6 + 0x14) * 0x51eb851f) s>> 0x20
        int32_t r7_2 = (r0_13 s>> 5) + (r0_13 u>> 0x1f)
        int32_t r2_2 = 0x80000004
        
        if (r9_1 s< __aeabi_idiv(0x7ffffffc, r7_2))
            r2_2 = r9_1 * (0 - r7_2)
        
        r1_9 = r10_1 + r8_2 + r2_2
        break
else
    int32_t r7 = *(r6 + 0x14)
    int32_t r8
    
    if (r7 == 0)
        sub_cc180(r4, 0)
        int32_t r0_17
        int32_t r1_10
        r1_10:r0_17 = *(r6 + 8)
        r5_1 = r6 + 0x3d
        r8 = r1_10 + r0_17
        r7 = r8
    else
        r5_1 = r6 + 0x3d
        
        while (zx.d(*r5_1) != 5)
            sub_cb648(r4)
        
        r8 = *(r6 + 0xc) + *(r6 + 8)
        int32_t r1_2 = *(r6 + 0xa0) * r7 u/ 0x64
        *(r6 + 0x3d) = 0
        
        if (r8 u> r1_2)
            r7 = 0
    
    *(r6 + 0x14) = r7
    int32_t r0_18 = (r8 * 0x51eb851f) s>> 0x20
    int32_t r7_3 = (r0_18 s>> 5) + (r0_18 u>> 0x1f)
    int32_t r0_19 = __aeabi_idiv(0x7ffffffc, r7_3)
    int32_t r1_13 = *(r6 + 0x9c)
    int32_t r3_2 = 0x80000004
    
    if (r1_13 s< r0_19)
        r3_2 = r1_13 * (0 - r7_3)
    
    r1_9 = r3_2 + r8

sub_d74f0(r6, r1_9)
uint32_t i = *(r6 + 0x68)

if (i != 0)
    int32_t r7_4 = 0
    
    do
        if (r7_4 u>= 4)
            i = zx.d(*r5_1)
            
            if (i != 5)
                break
        
        void* r6_1
        r4, r6_1 = sub_cbfc0(r4, 1)
        i = *(r6_1 + 0x68)
        r7_4 += 1
    while (i != 0)

return i
