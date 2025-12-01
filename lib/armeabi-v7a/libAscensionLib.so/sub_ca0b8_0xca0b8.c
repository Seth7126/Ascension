// 函数: sub_ca0b8
// 地址: 0xca0b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t* r11_1 = &var_8
int32_t* r0 = *arg2
int32_t r1 = *r0
*r0 = r1 - 1
uint32_t r7

if (r1 == 0)
    r7 = sub_e0ffc(r0)
else
    char* r1_1 = r0[1]
    r0[1] = &r1_1[1]
    r7 = zx.d(*r1_1)

char* s = arg2[0xd]
void* r0_5
char const* const r2_5
bool cond:1_1
bool cond:2_1

if (r7 == 0x1b)
    char* r0_3
    
    if (s != 0)
        r0_3 = strchr(s, 0x62)
        cond:1_1 = r0_3 == 0
        cond:2_1 = r0_3 == 0
    
    if (s != 0 && r0_3 == 0)
        r2_5 = "binary"
        goto label_ca20c
    
    r0_5, r11_1 = sub_ddbec(arg1, *arg2, &arg2[1], arg2[0xe])
    goto label_ca184

char* r0_7

if (s != 0)
    r0_7 = strchr(s, 0x74)
    cond:1_1 = r0_7 == 0
    cond:2_1 = r0_7 == 0

if (s != 0 && r0_7 == 0)
    r2_5 = "text"
label_ca20c:
    sub_d2f3c(arg1, "attempt to load a %s chunk (mode is '%s')", r2_5)
    int32_t* r0_19
    void* r1_5
    int32_t* r2_6
    int32_t r3_3
    r0_19, r1_5, r2_6, r3_3 = sub_c8c5c(arg1, 3)
    
    if (cond:2_1)
        jump(r7 * arg2)
    
    if (cond:1_1)
        jump(r3_3 * arg2)
    
    return sub_ca22c(r0_19, r1_5, r2_6, arg1) __tailcall

r0_5 = sub_d3ad4(arg1, *arg2, &arg2[1], &arg2[4], arg2[0xe], r7)
label_ca184:

if (zx.d(*(r0_5 + 6)) != 0)
    int32_t i = 0
    
    do
        void* r0_13 = sub_caa5c(arg1)
        *(r0_5 + 0x10 + (i << 2)) = r0_13
        
        if ((zx.d(*(r0_13 + 5)) & 3) != 0 && (zx.d(*(r0_5 + 5)) & 4) != 0)
            sub_cade0(arg1, r0_5, r0_13)
        
        i += 1
    while (i u< zx.d(*(r0_5 + 6)))

*(r11_1 - 0x10)
*(r11_1 - 0xc)
*(r11_1 - 8)
*(r11_1 - 4)
*r11_1
jump(r11_1[1])
