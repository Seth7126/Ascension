// 函数: sub_cdbe0
// 地址: 0xcdbe0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = arg1
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_gettop(r6)
clearerr(arg2)
int32_t result
int32_t r7_1
uint32_t r10_1

if (r0_2 != 1)
    luaL_checkstack(r6, r0_2 + 0x13, "too many arguments")
    int32_t r9_1 = r0_2 - 2
    r7_1 = arg3
    int32_t var_448_1 = r6
    
    while (true)
        int64_t var_440
        int32_t var_438
        
        if (lua_type(r6, r7_1) != 3)
            char* r0_18 = lua_tolstring(r6, r7_1, 0)
            
            if (r0_18 == 0 || zx.d(*r0_18) != 0x2a)
                luaL_argerror(r6, r7_1, "invalid option")
            
            switch (sx.d(r0_18[1]) - 0x4c)
                case 0
                    r10_1 = sub_cdfd4(r6, arg2, 0)
                case 0x15
                    luaL_buffinit(r6, &var_440)
                    uint32_t r0_30 = fread(luaL_prepbuffsize(&var_440, 0x400), 1, 0x400, arg2)
                    int32_t r1_12 = var_438 + r0_30
                    var_438 = r1_12
                    
                    if (r0_30 u>= 0x400)
                        uint32_t count_2 = 0x400
                        bool cond:6_1
                        
                        do
                            int32_t r4_2 = 0
                            
                            if (count_2 u< 0x40000000)
                                r4_2 = 1
                            
                            uint32_t count_1 = count_2 << r4_2
                            uint32_t r0_33 =
                                fread(luaL_prepbuffsize(&var_440, count_1), 1, count_1, arg2)
                            cond:6_1 = r0_33 u>= count_2 << (r4_2 & 0xff)
                            count_2 = count_1
                            r1_12 = var_438 + r0_33
                            var_438 = r1_12
                        while (cond:6_1)
                    
                    luaL_pushresult(&var_440, r1_12)
                    r10_1 = 1
                    r6 = var_448_1
                case 0x20
                    r10_1 = sub_cdfd4(r6, arg2, 1)
                case 0x22
                    if (fscanf(arg2, "%lf", &var_440) != 1)
                        lua_pushnil(r6)
                        r10_1 = 0
                    else
                        int128_t q0
                        q0.q = var_440
                        unimplemented  {vmov r2, r3, d0}
                        lua_pushnumber(r6)
                        r10_1 = 1
                default
                    result = luaL_argerror(r6, r7_1, "invalid format")
                    break
        else
            uint32_t count = lua_tointegerx(r6, r7_1, 0)
            bool cond:2_1
            
            if (count == 0)
                int32_t character = getc(arg2)
                ungetc(character, arg2)
                lua_pushlstring(r6, 0, 0)
                r10_1 = character + 1
                cond:2_1 = character != 0xffffffff
            else
                luaL_buffinit(r6, &var_440)
                r10_1 = fread(luaL_prepbuffsize(&var_440, count), 1, count, arg2)
                var_438 += r10_1
                luaL_pushresult(&var_440)
                cond:2_1 = r10_1 != 0
            
            if (cond:2_1)
                r10_1 = 1
        r7_1 += 1
        
        if (r10_1 == 0)
            goto label_cdf28
        
        bool cond:4_1 = r9_1 != 0
        r9_1 -= 1
        
        if (not(cond:4_1))
            goto label_cdf28
else
    r10_1 = sub_cdfd4(r6, arg2, 1)
    r7_1 = arg3 + 1
label_cdf28:
    
    if (ferror(arg2) == 0)
        if (r10_1 == 0)
            lua_settop(r6, 0xfffffffe)
            lua_pushnil(r6)
        
        result = r7_1 - arg3
    else
        result = luaL_fileresult(r6, 0, 0)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
