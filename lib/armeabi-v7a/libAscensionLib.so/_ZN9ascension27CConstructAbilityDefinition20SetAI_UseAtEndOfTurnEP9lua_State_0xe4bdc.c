// 函数: _ZN9ascension27CConstructAbilityDefinition20SetAI_UseAtEndOfTurnEP9lua_State
// 地址: 0xe4bdc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
int32_t r0_2 = lua_toboolean(arg1, 2)

if (r0_2 != 0)
    r0_2 = 1

*(r0 + 0x198) = r0_2.b
return 0
