// 函数: _Z12SaveGameDatav
// 地址: 0x189010
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

AppWorldData* r0 = *s_pWorldData
int32_t r1 = *__stack_chk_guard
int32_t r1_1 = *(r0 + 0xf8)

if ((r1_1 == 2 || r1_1 == 1) && data_1f4e4c != 0)
    char* var_134 = nullptr
    int32_t r0_1 = SaveAppGameDataToBuffer(r0, &var_134)
    int32_t var_130
    __aeabi_memclr8(&var_130, 0x100)
    int16_t r4_1 = 1
    int32_t var_30
    __builtin_strcpy(&var_30, "PLAYDEK")
    __builtin_strcpy(&var_130, "PLAYDEK")
    int32_t var_128_1 = 1
    char var_124[0x20]
    strcpy(&var_124, *s_pWorldData + 0x24)
    char var_104[0x20]
    strcpy(&var_104, *s_pWorldData + 0x54)
    char var_e4[0x20]
    strcpy(&var_e4, *s_pWorldData + 0x84)
    char var_c4[0x20]
    strcpy(&var_c4, *s_pWorldData + 0xb4)
    int32_t* r0_7 = *s_pWorldData
    int32_t var_54_1 = r0_7[5]
    int32_t var_50_1 = r0_7[0x11]
    int32_t var_4c_1 = r0_7[0x1d]
    int32_t var_48_1 = r0_7[0x29]
    int16_t r1_17 = 1
    
    if (zx.d(r0_7[7].b) == 2)
        r1_17 = sx.w(*(r0_7 + 0x1d)) + 2
    
    int16_t var_78_1 = r1_17
    
    if (zx.d(r0_7[0x13].b) == 2)
        r4_1 = sx.w(*(r0_7 + 0x4d)) + 2
    
    int16_t var_76_1 = r4_1
    int32_t r1_21 = 1
    int16_t r2_2 = 1
    
    if (zx.d(r0_7[0x1f].b) == 2)
        r2_2 = sx.w(*(r0_7 + 0x7d)) + 2
    
    int16_t var_74_1 = r2_2
    uint32_t r2_4 = zx.d(r0_7[0x2b].b)
    
    if (r2_4 == 2)
        r1_21 = sx.d(*(r0_7 + 0xad))
    
    if (r2_4 == 2)
        r1_21 += 2
    
    int16_t var_72_1 = r1_21.w
    int32_t var_a4_1 = r0_7[1]
    int32_t var_34_1 = r0_7[0x35]
    uint32_t var_a0_1 = zx.d(*(r0_7 + 0xe))
    uint32_t var_9c_1 = zx.d(r0_7[4].w)
    uint32_t var_94_1 = zx.d(*(r0_7 + 0x12))
    void* r1_24 = *(r0_7 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    void* r2_9 = r1_24 + 0xb18
    
    if (r1_24 == 0)
        r2_9 = &r0_7[0x38]
    
    void* r3_2 = r1_24 + 0xb0c
    
    if (r1_24 == 0)
        r3_2 = &r0_7[0x39]
    
    int32_t var_98_1 = *r3_2
    int32_t var_90_1 = *r2_9
    uint32_t var_8c_1 = zx.d(r0_7[0x36].b)
    int32_t var_88_1 = r0_7[0x37]
    int32_t var_84_1 = *r0_7
    data_1f4e4c(var_134, r0_1, &var_130)
    char* r0_10 = var_134
    
    if (r0_10 != 0)
        operator delete[](r0_10)

int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r1)
    return r0_11 - r1

__stack_chk_fail()
noreturn
