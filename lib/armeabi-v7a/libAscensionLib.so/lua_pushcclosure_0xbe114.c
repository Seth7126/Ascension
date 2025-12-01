// 函数: lua_pushcclosure
// 地址: 0xbe114
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_5
void** r1_2
void* r7_1

if (arg3 == 0)
    r7_1 = &arg1[2]
    r1_2 = *r7_1
    r0_5 = 0x16
    *r1_2 = arg2
else
    int32_t i_1 = arg3
    
    if (*(arg1[3] + 0xc) s>= 1)
        sub_cc158(arg1)
    
    void* r0_4 = sub_ca9cc(arg1, i_1)
    *(r0_4 + 0xc) = arg2
    r7_1 = &arg1[2]
    int32_t r2 = 0xfffffff0 + (i_1 << 4)
    r1_2 = *r7_1 - (i_1 << 4)
    *r7_1 = r1_2
    int32_t i
    
    do
        void* r1_3 = r1_2 + r2
        int32_t r3_1 = *r1_3
        void* r4_1 = r0_4 + r2
        r2 -= 0x10
        i = i_1
        i_1 -= 1
        *(r4_1 + 0x14) = *(r1_3 + 4)
        *(r4_1 + 0x10) = r3_1
        *(r4_1 + 0x18) = *(r1_3 + 8)
        r1_2 = *r7_1
    while (i != 1)
    *r1_2 = r0_4
    r0_5 = 0x66

r1_2[2] = r0_5
int32_t result = *r7_1 + 0x10
*r7_1 = result
return result
