// 函数: _ZN9ascension27CConstructAbilityDefinition23SetAbilityConditionFuncEP9lua_State
// 地址: 0xe4ae4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t r0_2 = lua_tointegerx(arg1, 2, 0)
char* r0_4 = lua_tolstring(arg1, 3, 0)
int32_t r0_6 = lua_tointegerx(arg1, 4, 0)
void* r4 = r0 + (r0_2 << 6)
strncpy(r4 + 0x30, r0_4, 0x40)
*(r4 + 0x6f) = 0
int32_t r0_9 = ascension::FindEffectConditionFunc(r0_4)
void* r1_1 = r0 + (r0_2 << 2)
*(r1_1 + 0x184) = r0_6
*(r1_1 + 0x170) = r0_9
return 0
