// 函数: sub_d36f8
// 地址: 0xd36f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
time_t r0_22

if (lua_type(arg1, 1) s<= 0)
    r0_22 = time(nullptr)
    
    if (r0_22 != 0xffffffff)
    label_d39c4:
        int128_t q0
        q0.d = r0_22
        unimplemented  {vcvt.f64.s32 d0, s0}
        unimplemented  {vmov r2, r3, d0}
        lua_pushnumber(arg1)
    else
        lua_pushnil(arg1)
else
    luaL_checktype(arg1, 1, 5)
    lua_settop(arg1, 1)
    lua_getfield(arg1, 0xffffffff, 0x1c10e6)
    int32_t timeptr
    int32_t timeptr_1 = lua_tointegerx(arg1, 0xffffffff, &timeptr)
    int32_t timeptr_2 = timeptr
    lua_settop(arg1, 0xfffffffe)
    
    if (timeptr_2 == 0)
        timeptr_1 = timeptr_2
    
    timeptr = timeptr_1
    lua_getfield(arg1, 0xffffffff, 0x1c0bd9)
    int32_t var_20
    int32_t r5_1 = lua_tointegerx(arg1, 0xffffffff, &var_20)
    int32_t r7_1 = var_20
    lua_settop(arg1, 0xfffffffe)
    
    if (r7_1 == 0)
        r5_1 = r7_1
    
    int32_t var_48_1 = r5_1
    lua_getfield(arg1, 0xffffffff, "hour")
    int32_t r5_2 = lua_tointegerx(arg1, 0xffffffff, &var_20)
    int32_t r7_2 = var_20
    lua_settop(arg1, 0xfffffffe)
    
    if (r7_2 == 0)
        r5_2 = 0xc
    
    int32_t var_44_1 = r5_2
    lua_getfield(arg1, 0xffffffff, 0x1c10ef)
    int32_t r5_3 = lua_tointegerx(arg1, 0xffffffff, &var_20)
    
    if (var_20 == 0)
        r5_3 = luaL_error(arg1, "field '%s' missing in date table", 0x1c10ef)
    else
        lua_settop(arg1, 0xfffffffe)
    
    int32_t var_40_1 = r5_3
    lua_getfield(arg1, 0xffffffff, "month")
    int32_t r5_4 = lua_tointegerx(arg1, 0xffffffff, &var_20)
    
    if (var_20 == 0)
        r5_4 = luaL_error(arg1, "field '%s' missing in date table", "month")
    else
        lua_settop(arg1, 0xfffffffe)
    
    int32_t var_3c_1 = r5_4 - 1
    lua_getfield(arg1, 0xffffffff, "year")
    int32_t r5_5 = lua_tointegerx(arg1, 0xffffffff, &var_20)
    
    if (var_20 == 0)
        r5_5 = luaL_error(arg1, "field '%s' missing in date table", "year")
    else
        lua_settop(arg1, 0xfffffffe)
    
    int32_t var_38_1 = r5_5 - 0x76c
    int32_t r5_6 = 0xffffffff
    lua_getfield(arg1, 0xffffffff, "isdst")
    
    if (lua_type(arg1, 0xffffffff) != 0)
        r5_6 = lua_toboolean(arg1, 0xffffffff)
    
    lua_settop(arg1, 0xfffffffe)
    int32_t var_2c_1 = r5_6
    r0_22 = mktime(&timeptr)
    
    if (r0_22 != 0xffffffff)
        goto label_d39c4
    
    lua_pushnil(arg1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
