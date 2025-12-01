// 函数: lua_newstate
// 地址: 0xd77d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* result = nullptr
int32_t r0 = *__stack_chk_guard
int32_t* result_1 = arg1(arg2, 0, 8, 0x190)

if (result_1 != 0)
    result = nullptr
    *result_1 = 0
    result_1[0x2b].b = 0x21
    result_1[1].w = 0x108
    *(result_1 + 0xae) = 0
    result_1[0x1c] = arg1
    result_1[3] = &result_1[0x1c]
    result_1[4] = 0
    result_1[0x10] = 0
    result_1[0xa].w = 0x100
    result_1[0xb] = 0
    result_1[0xc] = 0
    result_1[0xd] = 0
    result_1[0xe] = 0
    result_1[7] = 0
    result_1[8] = 0
    result_1[9] = 1
    *(result_1 + 6) = 0
    result_1[0x11] = 0
    result_1[0x1d] = arg2
    result_1[0x47] = result_1
    time_t r0_4 = time(nullptr)
    time_t var_38 = r0_4
    int32_t* result_2 = result_1
    time_t* var_30_1 = &var_38
    void* const var_2c_1 = &data_1d13d0
    int32_t (* const var_28_1)() = lua_newstate
    result_1[0x2a] = sub_d7d40(&result_2, 0x10, r0_4)
    result_1[0x3c] = &result_1[0x38]
    result_1[0x3d] = &result_1[0x38]
    *(result_1 + 0xaf) = 0
    result_1[0x28] = 0
    result_1[0x40] = 0
    result_1[0x42] = 0
    result_1[0x46] = 0
    result_1[0x48] = 0
    result_1[0x21] = 0
    result_1[0x22] = 0
    result_1[0x23] = 0
    result_1[0x24] = 0
    *(result_1 + 0xad) = 5
    __aeabi_memclr4(&result_1[0x2d], 0x28)
    *(result_1 + 0x78) = result:0x190
    result_1[0x43] = 0xc8
    result_1[0x44] = 0xc8
    result_1[0x45] = 0xc8
    __aeabi_memclr4(&result_1[0x5b], 0x24)
    
    if (sub_c8cdc(result_1, sub_d798c, 0) == 0)
        result = result_1
    else
        sub_d7b90(result_1)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
