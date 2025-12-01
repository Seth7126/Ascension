// 函数: _ZN9ascension7CEffect17AddUsageConditionEP9lua_State
// 地址: 0xe6408
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = lua_touserdata(arg1, 1)
char* s = lua_tolstring(arg1, 2, 0)
int32_t r0_3 = lua_tointegerx(arg1, 3, 0)
uint32_t r0_5 = strlen(s)
strncpy(&r0[1 + *r0 * 0x12], s, 0x40)
*(&r0[1 + *r0 * 0x12] + 0x3f) = 0
*(&r0[1 + *r0 * 0x12] + r0_5) = 0
int32_t r0_16 = ascension::FindEffectConditionFunc(s)
int32_t r1_1 = *r0
void* r2_1 = &r0[1 + r1_1 * 0x12]
*(r2_1 + 0x40) = r0_16
*(r2_1 + 0x44) = r0_3
*r0 = r1_1 + 1
return 0
