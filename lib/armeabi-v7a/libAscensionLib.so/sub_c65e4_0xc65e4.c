// 函数: sub_c65e4
// 地址: 0xc65e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_tothread(arg1, 1)

if (r0_2 != 0)
    if (r0_2 == arg1)
        goto label_c6670
    
    goto label_c6628

luaL_argerror(arg1, 1, "coroutine expected")
int32_t r0_8
char const* const r1
int32_t r2_1

if (r0_2 != arg1)
label_c6628:
    int32_t r0_4 = lua_status()
    
    if (r0_4 == 0)
        void var_80
        
        if (lua_getstack(r0_2, 0, &var_80) s< 1)
            if (lua_gettop(r0_2) == 0)
                goto label_c6640
            
            goto label_c66c0
        
        r0_8 = arg1
        r2_1 = 6
        r1 = "normal"
    else if (r0_4 == 1)
    label_c66c0:
        r0_8 = arg1
        r2_1 = 9
        r1 = "suspended"
    else
    label_c6640:
        r0_8 = arg1
        r2_1 = 4
        r1 = "dead"
else
label_c6670:
    r0_8 = arg1
    r2_1 = 7
    r1 = "running"

lua_pushlstring(r0_8, r1, r2_1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
