// 函数: _ZN9ascension23CActiveEffectDefinition22SetEffectConditionFuncEP9lua_State
// 地址: 0xe6d58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_2 = lua_touserdata(arg1, 1)
char* r6 = nullptr
int32_t r0_4 = lua_tointegerx(arg1, 2, 0)
char* r0_6 = lua_tolstring(arg1, 3, 0)

if (lua_isnumber(arg1, 4) == 0)
    if (lua_isstring(arg1, 4) != 0)
        r6 = nullptr
        char* s = lua_tolstring(arg1, 4, 0)
        strlen(s)
        char* r0_16 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)
        
        if (r0_16 != 0)
            strcpy(r0_16, s)
            r6 = r0_16
else
    r6 = lua_tointegerx(arg1, 4, 0)

void* r5_2 = r0_2 + (r0_4 << 6)
strncpy(r5_2 + 0x5c, r0_6, 0x40)
*(r5_2 + 0x9b) = 0
int32_t var_2c = 0
int32_t var_30 = 0
void* r1_5 = r0_2 + (r0_4 << 2)
*(r1_5 + 0x19c) = ascension::FindEffectActiveConditionFunc(r0_6, &var_30)
int32_t r3 = *(r0_2 + 0xc)
*(r0_2 + 8) |= var_30
*(r0_2 + 0xc) = r3 | var_2c
*(r1_5 + 0x1b0) = r6

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
