// 函数: _ZN9ascension26CTriggeredEffectDefinition16AddTriggerEffectEP9lua_State
// 地址: 0xe752c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
int32_t r6 = 0
char* r0_2 = lua_tolstring(arg1, 2, 0)

if (lua_isnumber(arg1, 3) == 0)
    if (lua_type(arg1, 3) == 2)
        r6 = lua_touserdata(arg1, 3)
else
    r6 = lua_tointegerx(arg1, 3, 0)

strncpy(r0 + 0x1cc + *(r0 + 0x1c8) * 0x48, r0_2, 0x40)
*(r0 + 0x1cc + *(r0 + 0x1c8) * 0x48 + 0x3f) = 0
*(r0 + 0x1cc + *(r0 + 0x1c8) * 0x48 + 0x3f) = 0
int32_t r0_20 = ascension::FindEffectTriggerFunc(r0_2)
int32_t r1_1 = *(r0 + 0x1c8)
void* r2_1 = r0 + 0x1cc + r1_1 * 0x48
*(r2_1 + 0x40) = r0_20
*(r2_1 + 0x44) = r6
*(r0 + 0x1c8) = r1_1 + 1
return 0
