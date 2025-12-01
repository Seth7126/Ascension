// 函数: sub_cc180
// 地址: 0xcc180
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result_1 = arg1[3]
int32_t* r4 = arg1
uint32_t r9 = zx.d(*(result_1 + 0x3e))

if (arg2 == 0)
    void* i = *(result_1 + 0x68)
    *(result_1 + 0x3e) = 0
    
    if (i == 0)
        goto label_cc1b0
    
    do
        *(i + 5) &= 0xbf
        r4, r9, result_1 = sub_cbfc0(r4, 1)
        i = *(result_1 + 0x68)
    while (i != 0)
    
    if (zx.d(*(result_1 + 0x3e)) == 2 || zx.d(*(result_1 + 0x3d)) u<= 1)
        goto label_cc200
else
    *(result_1 + 0x3e) = 1
label_cc1b0:
    
    if (zx.d(*(result_1 + 0x3d)) u<= 1)
    label_cc200:
        void* r5_1 = r4[3]
        *(r5_1 + 0x40) = 0
        *(r5_1 + 0x3d) = 2
        int32_t* i_1
        
        do
            i_1 = sub_cb400(r4, r5_1 + 0x48, 1)
        while (i_1 == r5_1 + 0x48)
        
        *(r5_1 + 0x50) = i_1
        int32_t* i_2
        
        do
            i_2 = sub_cb400(r4, r5_1 + 0x44, 1)
        while (i_2 == r5_1 + 0x44)
        
        *(r5_1 + 0x4c) = i_2

uint32_t i_3 = 5
char* r7_4 = r4[3] + 0x3d

if (zx.d(*r7_4) != 5)
    do
        sub_cb648(r4)
    while (zx.d(*r7_4) != 5)
    
    r7_4 = r4[3] + 0x3d
    i_3 = zx.d(*r7_4)

if ((0xffffffdf & 1 << (i_3 & 0xff)) != 0)
    for (; i_3 != 5; i_3 = zx.d(*r7_4))
    label_cc2bc:
        sub_cb648(r4)
else
    do
        sub_cb648(r4)
    while ((0xffffffdf & 1 << zx.d(*r7_4)) == 0)
    
    r7_4 = r4[3] + 0x3d
    
    if (zx.d(*r7_4) != 5)
        goto label_cc2bc

if (r9 == 2)
    void* r5_2 = r4[3]
    
    while (zx.d(*(r5_2 + 0x3d)) != 0)
        sub_cb648(r4)

int32_t r0_13
int32_t r1_5
r1_5:r0_13 = *(result_1 + 8)
int32_t r5_3 = *(result_1 + 0x9c)
int32_t r6 = r1_5 + r0_13
*(result_1 + 0x3e) = r9.b
int32_t r0_14 = (r6 * 0x51eb851f) s>> 0x20
int32_t r7_7 = (r0_14 s>> 5) + (r0_14 u>> 0x1f)
int32_t r2 = 0x80000004
void* result = result_1

if (r5_3 s< __aeabi_idiv(0x7ffffffc, r7_7))
    r2 = r7_7 * (0 - r5_3)

sub_d74f0(result, r2 + r6)

if (arg2 == 0)
    void* r5_4 = r4[3]
    
    while (true)
        result = *(r5_4 + 0x68)
        
        if (result == 0)
            break
        
        *(result + 5) &= 0xbf
        r4 = sub_cbfc0(r4, 1)

return result
