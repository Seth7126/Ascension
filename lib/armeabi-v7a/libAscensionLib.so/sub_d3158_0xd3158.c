// 函数: sub_d3158
// 地址: 0xd3158
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
char* s1 = luaL_optlstring(arg1, 1, 0x1c10e0, 0)
time_t timer_1

if (lua_type(arg1, 2) s<= 0)
    timer_1 = time(nullptr)
else
    luaL_checknumber(arg1, 2)
    unimplemented  {vmov d0, r0, r1}
    unimplemented  {vcvt.s32.f64 s0, d0}
    time_t timer_2
    timer_1 = timer_2

time_t timer = timer_1
struct tm* timeptr

if (zx.d(*s1) != 0x21)
    timeptr = localtime(&timer)
    
    if (timeptr != 0)
    label_d3204:
        
        if (strcmp(s1, "*t") == 0)
            lua_createtable(arg1, 0, 9)
            lua_pushinteger(arg1, timeptr->__offset(0x0).d)
            lua_setfield(arg1, 0xfffffffe, 0x1c10e6)
            lua_pushinteger(arg1, timeptr->__offset(0x4).d)
            lua_setfield(arg1, 0xfffffffe, 0x1c0bd9)
            lua_pushinteger(arg1, timeptr->__offset(0x8).d)
            lua_setfield(arg1, 0xfffffffe, "hour")
            lua_pushinteger(arg1, timeptr->__offset(0xc).d)
            lua_setfield(arg1, 0xfffffffe, 0x1c10ef)
            lua_pushinteger(arg1, timeptr->__offset(0x10).d + 1)
            lua_setfield(arg1, 0xfffffffe, "month")
            lua_pushinteger(arg1, timeptr->__offset(0x14).d + 0x76c)
            lua_setfield(arg1, 0xfffffffe, "year")
            lua_pushinteger(arg1, timeptr->__offset(0x18).d + 1)
            lua_setfield(arg1, 0xfffffffe, "wday")
            lua_pushinteger(arg1, timeptr->__offset(0x1c).d + 1)
            lua_setfield(arg1, 0xfffffffe, "yday")
            int32_t r1_12 = timeptr->__offset(0x20).d
            
            if (r1_12 s>= 0)
                lua_pushboolean(arg1, r1_12)
                lua_setfield(arg1, 0xfffffffe, "isdst")
        else
            char format = 0x25
            uint8_t* var_43c
            luaL_buffinit(arg1, &var_43c)
            
            while (true)
                uint32_t r0_16 = zx.d(*s1)
                
                if (r0_16 == 0x25)
                    void* s1_1 = &s1[1]
                    int32_t __c = sx.d(*s1_1)
                    int32_t r10_1 = __c & 0xff
                    void* r0_17
                    
                    if (r10_1 != 0)
                        r0_17 = memchr("aAbBcdHIjmMpSUwWxXyYz%", __c, 0x17)
                    
                    if (r10_1 == 0 || r0_17 == 0)
                        luaL_argerror(arg1, 1, 
                            lua_pushfstring(arg1, "invalid conversion specifier '%%%s'", s1_1))
                    else
                        s1_1 = &s1[2]
                        char var_506_1 = 0
                        char var_507_1 = r10_1.b
                    
                    char str[0xc8]
                    luaL_addlstring(&var_43c, &str, strftime(&str, 0xc8, &format, timeptr))
                    s1 = s1_1
                else
                    if (r0_16 == 0)
                        break
                    
                    int32_t var_434
                    int32_t r1_3 = var_434
                    int32_t var_438
                    
                    if (r1_3 u>= var_438)
                        luaL_prepbuffsize(&var_43c, 1, var_438)
                        r0_16 = zx.d(*s1)
                        r1_3 = var_434
                    
                    var_434 = r1_3 + 1
                    s1 = &s1[1]
                    var_43c[r1_3] = r0_16.b
            
            luaL_pushresult(&var_43c)
    else
        lua_pushnil(arg1)
else
    timeptr = gmtime(&timer)
    s1 = &s1[1]
    
    if (timeptr != 0)
        goto label_d3204
    
    lua_pushnil(arg1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
