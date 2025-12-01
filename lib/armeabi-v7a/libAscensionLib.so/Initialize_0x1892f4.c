// 函数: Initialize
// 地址: 0x1892f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (zx.d(data_1f4e54) == 0)
    __aeabi_memclr8(&data_1f4e58, 0xa2c)
    int32_t (* const var_28)(lua_State*) = ascensionrules::RegisterLua_ascensionrules
    ascension::LoadLuaFunctions(1, &var_28, arg1)
    ascensionrules::BuildGlobalCardInstances()
    data_1f4e54 = 1

if (arg2 s>= 2)
    ascension_ai::AIHandlerThread_Init()

ascension_ai::AIHandlerThread_StopEvaluation()
int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r0)
    return r0_1 - r0

__stack_chk_fail()
noreturn
