// 函数: sub_d8480
// 地址: 0xd8480
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7
int32_t var_18 = r7
int32_t r6
int32_t var_1c = r6
int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
unimplemented  {vpush {d8, d9}}
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_gettop(arg1)
int32_t var_468
char* r6_1 = luaL_checklstring(arg1, 1, &var_468)
int32_t r4_1 = var_468
char* var_44c
luaL_buffinit(arg1, &var_44c)

if (r4_1 s< 1)
label_d8b80:
    luaL_pushresult(&var_44c)
else
    unimplemented  {vmov.f64 d8, #-1.000000e+00}
    char var_45d[0x11]
    char (* var_474_1)[0x11] = &var_45d
    void* r5_2 = &r6_1[r4_1]
    int32_t r9_1 = 1
    void* var_478_1 = r5_2
    unimplemented  {vmov.f64 d9, #1.000000e+00}
    
    while (true)
        uint32_t r0_69 = zx.d(*r6_1)
        int32_t r4_8 = r9_1
        int32_t var_448
        int32_t var_444
        
        if (r0_69 != 0x25)
            int32_t r1_37 = var_444
            
            if (r1_37 u>= var_448)
                luaL_prepbuffsize(&var_44c, 1, var_448)
                r0_69 = zx.d(*r6_1)
                r1_37 = var_444
            
            var_444 = r1_37 + 1
            r6_1 = &r6_1[1]
            r9_1 = r4_8
            var_44c[r1_37] = r0_69.b
            
            if (r6_1 u>= r5_2)
                goto label_d8b80
        else
            if (zx.d(r6_1[1]) != 0x25)
                char* str_1 = luaL_prepbuffsize(&var_44c, 0x200)
                r9_1 = r4_8 + 1
                
                if (r4_8 s>= r0_2)
                    luaL_argerror(arg1, r9_1, "no value")
                
                uint32_t r4_2 = zx.d(r6_1[1])
                char r5_3 = 0
                void* r6_3
                
                if (r4_2 == 0)
                    r6_3 = &r6_1[1]
                else
                    void* r6_2 = &r6_1[2]
                    
                    while (true)
                        if (memchr("-+ #0", r4_2 << 0xfffffffc s>> 0x18, 6) == 0)
                            r6_3 = r6_2 - 1
                            r5_3 = r4_2.b
                            break
                        
                        r4_2 = zx.d(*r6_2)
                        r6_2 += 1
                        
                        if (r4_2 == 0)
                            r6_3 = r6_2 - 1
                            break
                
                if (r6_3 - &r6_1[1] u>= 6)
                    luaL_error(arg1, "invalid format (repeated flags)")
                    r5_3 = *r6_3
                
                if (0xffffffd0 + zx.d(r5_3) u< 0xa)
                    r6_3 += 1
                
                void* r0_14 = r6_3 + 1
                
                if (zx.d(*r6_3) - 0x30 u>= 0xa)
                    r0_14 = r6_3
                
                uint32_t r1_5 = zx.d(*r0_14)
                void* r6_5
                
                if (r1_5 != 0x2e)
                    r6_5 = r0_14
                else
                    r6_5 = r0_14 + 1
                    int32_t r1_8 = 1
                    
                    if (zx.d(*r6_5) - 0x30 u< 0xa)
                        r1_8 = 2
                        r6_5 = r0_14 + 2
                    
                    if (zx.d(*(r0_14 + r1_8)) - 0x30 u< 0xa)
                        r6_5 += 1
                    
                    r1_5 = zx.d(*r6_5)
                
                if (r1_5 - 0x30 u<= 9)
                    luaL_error(arg1, "invalid format (width or precision too long)")
                
                char* r5_4 = var_474_1
                char var_45e = 0x25
                __aeabi_memcpy(r5_4, &r6_1[1], r6_5 - &r6_1[1] + 1)
                *(r5_4 + r6_5 - &r6_1[1] + 1) = 0
                r6_1 = r6_5 + 1
                int32_t r0_20 = sx.d(*r6_5) - 0x45
                int32_t str
                int32_t r0_27
                int32_t r0_29
                int32_t r1_15
                char const* const r2_4
                int32_t r4_4
                int32_t r7_2
                
                switch (r0_20)
                    case 0, 2, 0x20, 0x21, 0x22
                        (&var_45e)[strlen(&var_45e)] = 0
                        int32_t r0_25
                        int32_t r1_12
                        r0_25, r1_12 = luaL_checknumber(arg1, r9_1)
                        r0_27 =
                            sprintf(str_1, &var_45e, r0_25, r1_12, var_478_1, var_474_1, r0_2, arg1)
                    label_d8858:
                        r7_2 = r0_27
                    label_d885c:
                        r5_2 = var_478_1
                        var_444 += r7_2
                        
                        if (r6_1 u>= r5_2)
                            goto label_d8b80
                        
                        continue
                    case 0x13, 0x2a, 0x30, 0x33
                        luaL_checknumber(arg1, r9_1)
                        unimplemented  {vmov d0, r0, r1}
                        unimplemented  {vcvt.u32.f64 s2, d0}
                        r4_4 = arg3:8.d
                        unimplemented  {vcvt.f64.u32 d1, s2}
                        arg3.q = arg3.q f- arg3:8.q
                        unimplemented  {vcmpe.f64 d0, d8}
                        unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r0_20 s> 0x33)
                            unimplemented  {vcmpe.f64 d0, d9}
                            unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r0_20 s> 0x33 && r0_20 - 0x33 s< 0)
                            goto label_d8828
                        
                        r0_29 = arg1
                        r1_15 = r9_1
                        r2_4 = "not a non-negative number in proper range"
                    label_d881c:
                        luaL_argerror(r0_29, r1_15, r2_4)
                    label_d8828:
                        uint32_t r0_32 = strlen(&var_45e)
                        void* r1_17 = &(&var_45e)[r0_32]
                        char r2_5 = *(r1_17 - 1)
                        *(r1_17 - 1) = 0x6c
                        (&var_45e)[r0_32] = r2_5
                        *(r1_17 + 1) = 0
                        r0_27 = sprintf(str_1, &var_45e, r4_4)
                        goto label_d8858
                    case 0x1e
                        r0_27 = sprintf(str_1, &var_45e, luaL_checkinteger(arg1, r9_1))
                        goto label_d8858
                    case 0x1f, 0x24
                        luaL_checknumber(arg1, r9_1)
                        unimplemented  {vmov d0, r0, r1}
                        unimplemented  {vcvt.s32.f64 s2, d0}
                        r4_4 = arg3:8.d
                        unimplemented  {vcvt.f64.s32 d1, s2}
                        arg3.q = arg3.q f- arg3:8.q
                        unimplemented  {vcmpe.f64 d0, d8}
                        unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r0_20 s> 0x33)
                            unimplemented  {vcmpe.f64 d0, d9}
                            unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r0_20 s> 0x33 && r0_20 - 0x33 s< 0)
                            goto label_d8828
                        
                        r0_29 = arg1
                        r1_15 = r9_1
                        r2_4 = "not a number in proper range"
                        goto label_d881c
                    case 0x2c
                        int32_t i_1
                        void* r0_39 = luaL_checklstring(arg1, r9_1, &i_1)
                        int32_t r0_40 = var_444
                        
                        if (r0_40 u>= var_448)
                            luaL_prepbuffsize(&var_44c, 1)
                            r0_40 = var_444
                        
                        int32_t var_444_1 = r0_40 + 1
                        var_44c[r0_40] = 0x22
                        int32_t i_2 = i_1
                        i_1 = i_2 - 1
                        
                        if (i_2 != 0)
                            char* r4_6 = r0_39 + 1
                            int32_t i
                            
                            do
                                uint32_t c = zx.d(*(r4_6 - 1))
                                
                                if (c s<= 0x21)
                                    if (c != 0)
                                        if (c == 0xa)
                                            goto label_d8970
                                        
                                        goto label_d891c
                                    
                                    c = 0
                                label_d89f4:
                                    char* format
                                    
                                    if (zx.d(*r4_6) - 0x30 u< 0xa)
                                        format = "\%03d"
                                    else
                                        format = &data_1c1694
                                    
                                    sprintf(&str, format, c)
                                    luaL_addstring(&var_44c, &str)
                                else if (c != 0x5c && c != 0x22)
                                label_d891c:
                                    
                                    if (iscntrl(c) != 0)
                                        goto label_d89f4
                                    
                                    int32_t r0_44 = var_444_1
                                    
                                    if (r0_44 u>= var_448)
                                        luaL_prepbuffsize(&var_44c, 1)
                                        c = zx.d(*(r4_6 - 1))
                                        r0_44 = var_444_1
                                    
                                    var_444_1 = r0_44 + 1
                                    var_44c[r0_44] = c.b
                                else
                                label_d8970:
                                    int32_t r0_46 = var_444_1
                                    
                                    if (r0_46 u>= var_448)
                                        luaL_prepbuffsize(&var_44c, 1)
                                        r0_46 = var_444_1
                                    
                                    var_44c[r0_46] = 0x5c
                                    int32_t r0_48 = r0_46 + 1
                                    
                                    if (r0_48 u>= var_448)
                                        luaL_prepbuffsize(&var_44c, 1, 0x5c)
                                        r0_48 = r0_46 + 1
                                    
                                    var_444_1 = r0_48 + 1
                                    var_44c[r0_48] = *(r4_6 - 1)
                                
                                i = i_1
                                r4_6 = &r4_6[1]
                                i_1 = i - 1
                            while (i != 0)
                        
                        int32_t r0_54 = var_444_1
                        
                        if (r0_54 u>= var_448)
                            luaL_prepbuffsize(&var_44c, 1)
                            r0_54 = var_444_1
                        
                        var_444 = r0_54 + 1
                        r7_2 = 0
                        var_44c[r0_54] = 0x22
                        goto label_d885c
                    case 0x2e
                        int32_t r0_57 = luaL_tolstring(arg1, r9_1, &str)
                        
                        if (strchr(&var_45e, 0x2e) != 0 || str u< 0x64)
                            r7_2 = sprintf(str_1, &var_45e, r0_57)
                            lua_settop(arg1, 0xfffffffe)
                        else
                            luaL_addvalue(&var_44c)
                            r7_2 = 0
                        
                        goto label_d885c
                
                luaL_error(arg1, "invalid option '%%%c' to 'format'")
                break
            
            char r1_36 = 0x25
            int32_t r0_66 = var_444
            
            if (r0_66 u>= var_448)
                luaL_prepbuffsize(&var_44c, 1, var_448)
                r1_36 = r6_1[1]
                r0_66 = var_444
            
            var_444 = r0_66 + 1
            r6_1 = &r6_1[2]
            r9_1 = r4_8
            var_44c[r0_66] = r1_36
            
            if (r6_1 u>= r5_2)
                goto label_d8b80

if (*__stack_chk_guard == r0)
    unimplemented  {vpopeq {d8, d9}}
    jump(arg2)

__stack_chk_fail()
noreturn
