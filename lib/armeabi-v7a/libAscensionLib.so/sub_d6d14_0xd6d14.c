// 函数: sub_d6d14
// 地址: 0xd6d14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = arg2
void* r6 = *(arg1 + 0x40)
int32_t* r0 = *(arg1 + 0x30)
int32_t r8 = *(r6 + 0xc)
void* r3 = r8 + (arg2 << 4)
uint32_t r1 = zx.d(*(r3 + 0xc))

if (r1 u< zx.d(*(arg3 + 0xc)))
    int32_t r2_2 = *sub_d67dc(r0, r1)
    int32_t* r8_1 = r8 + (r4 << 4)
    r8_1[2]
    int32_t var_28 = r2_2 + 0x10
    void* r0_8
    int32_t r1_4
    int32_t r11
    int32_t lr
    r0_8, r1_4, r11, lr = sub_d6de0(arg1, 
        sub_d2f3c(*(arg1 + 0x34), "<goto %s> at line %d jumps into the scope of local '%s'", 
            *r8_1 + 0x10))
    int32_t var_2c = lr
    int32_t var_30 = r11
    *(r0_8 + 0x10) = 0
    void* r0_9
    int32_t r1_5
    r0_9, r1_5 = sub_ce78c(r0_8, r1_4, arg4, 0)
    return sub_d6df4(r0_9, r1_5) __tailcall

sub_c3e9c(r0, *(r3 + 4), *(arg3 + 4))
int32_t result = *(r6 + 0x10) - 1

if (result s> r4)
    do
        int32_t r0_2 = *(r6 + 0xc)
        void* r1_2 = r0_2 + (r4 << 4)
        int32_t r3_1 = *(r1_2 + 0x14)
        int32_t r7_2 = *(r1_2 + 0x18)
        int32_t r5_1 = *(r1_2 + 0x1c)
        *(r0_2 + (r4 << 4)) = *(r1_2 + 0x10)
        r4 += 1
        *(r1_2 + 4) = r3_1
        *(r1_2 + 8) = r7_2
        *(r1_2 + 0xc) = r5_1
        result = *(r6 + 0x10) - 1
    while (r4 s< result)

*(r6 + 0x10) = result
return result
