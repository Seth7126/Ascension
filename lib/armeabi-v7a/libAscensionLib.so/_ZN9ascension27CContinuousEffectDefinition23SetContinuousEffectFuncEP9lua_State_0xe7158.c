// 函数: _ZN9ascension27CContinuousEffectDefinition23SetContinuousEffectFuncEP9lua_State
// 地址: 0xe7158
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = lua_touserdata(arg1, 1)
int32_t r8 = 0
char* s = lua_tolstring(arg1, 2, 0)

if (lua_isnumber(arg1, 3) == 0)
    if (lua_type(arg1, 3) == 2)
        r8 = lua_touserdata(arg1, 3)
else
    r8 = lua_tointegerx(arg1, 3, 0)

uint32_t r0_12 = strlen(s)
strncpy(r0_2 + 0x1c4, s, 0x40)
*(r0_2 + 0x203) = 0
*(r0_2 + 0x1c4 + r0_12) = 0
int32_t var_2c = 0
int32_t var_30 = 0
int32_t r0_15 = ascension::FindEffectContinuousFunc(s, &var_30)
int32_t r2
int32_t r3
r3:r2 = *(r0_2 + 8)
int32_t r1_2 = var_30
*(r0_2 + 0x204) = r0_15
*(r0_2 + 0x208) = r8
*(r0_2 + 8) = (r3 | var_2c):(r2 | r1_2)

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
