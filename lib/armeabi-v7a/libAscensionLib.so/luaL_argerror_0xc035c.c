// 函数: luaL_argerror
// 地址: 0xc035c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = arg2
int32_t r0 = *__stack_chk_guard
void* var_88
void var_80
int32_t r0_10
char const* const r1_1
void* r2_2
void* const r3

if (lua_getstack(arg1, 0, &var_80) == 0)
    r0_10 = arg1
    r2_2 = r5
    r3 = arg3
    r1_1 = "bad argument #%d (%s)"
else
    lua_getinfo(arg1, 0x1bfd8d, &var_80)
    char* s1
    int32_t r0_5 = strcmp(s1, "method")
    void* temp2_1
    
    if (r0_5 == 0)
        temp2_1 = r5
        r5 -= 1
    
    void* var_7c
    
    if (r0_5 == 0 && temp2_1 == 1)
        r0_10 = arg1
        r2_2 = var_7c
        r3 = arg3
        r1_1 = "calling '%s' on bad self (%s)"
    else
        r3 = var_7c
        
        if (r3 == 0)
            if (sub_c0580(arg1, &var_80) == 0)
                r3 = &data_1bfd31
            else
                r3 = lua_tolstring(arg1, 0xffffffff, 0)
            
            void* const var_7c_1 = r3
        
        r0_10 = arg1
        r2_2 = r5
        var_88 = arg3
        r1_1 = "bad argument #%d to '%s' (%s)"

int32_t result = luaL_error(r0_10, r1_1, r2_2, r3, var_88)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
