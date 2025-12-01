// 函数: sub_dc940
// 地址: 0xdc940
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_30 = 0
int32_t r8 = 1
int32_t r0_1 = lua_tointegerx(arg1, 1, 0)
int32_t* r0_3 = lua_touserdata(arg1, 2)
char* r0_4 = *r0_3
int32_t r5 = 0
int32_t r4 = 1

if (r0_4 != 0 && zx.d(*r0_4) != 0)
    data_1e205c = r0_4

char* r2 = r0_3[1]
int32_t var_34 = 0

if (r2 != 0)
    int32_t r1_2 = 1
    uint32_t r3_1 = 0
    int32_t r12_1 = 0
    int32_t r0_5 = 0
    int32_t r4_1 = 0
    uint32_t r7_1
    
    while (true)
        r7_1 = r3_1
        r3_1 = zx.d(*r2)
        int32_t r6_3
        
        if (r3_1 != 0x2d)
        label_dcb94:
            r6_3 = r1_2
            
            if (r6_3 s> 0xffffffff)
                goto label_dcba0
        else
            r3_1 = sx.d(r2[1])
            int32_t r6_1 = r3_1 - 0x45
            
            if (r6_1 u> 0x31)
                if (r3_1 == 0)
                    goto label_dcb94
                
                if (r3_1 != 0x2d)
                    goto label_dcb84
                
                r6_3 = 0xffffffff
                
                if (zx.d(r2[2]) == 0)
                    r6_3 = r1_2 + 1
                    
                    if (r0_3[r6_3] != 0)
                        goto label_dcb88
                    
                    r6_3 = 0
                label_dcba0:
                    var_34 = r4_1
                    r5 = r12_1
                    r8 = 1
                    r4 = 1
                    var_30 = r6_3
                    break
            else
                r3_1 = 1
                
                switch (r6_1)
                    case 0
                        goto label_dcb30
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 0xa, 0xb, 0xc, 0xd, 0xe, 0xf, 0x10, 0x11, 0x12, 
                        0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 
                        0x1f, 0x21, 0x22, 0x23, 0x25, 0x26, 0x28, 0x29, 0x2a, 0x2b, 0x2c, 0x2d, 
                        0x2e, 0x2f, 0x30
                    label_dcb84:
                        r6_3 = 0 - r1_2
                    label_dcb88:
                        
                        if (r6_3 s> 0xffffffff)
                            goto label_dcba0
                    case 0x20
                        r12_1 = 1
                    label_dcacc:
                        
                        if (zx.d(r2[2]) != 0)
                            r3_1 = r7_1
                        label_dcb30:
                            r1_2 += 1
                            r2 = r0_3[r1_2]
                            
                            if (r2 != 0)
                                continue
                            else
                                r6_3 = 0
                                r7_1 = r3_1
                            
                            goto label_dcba0
                        
                        r3_1 = r0_3[r1_2 + 1]
                        
                        if (r3_1 == 0)
                            goto label_dcb84
                        
                        r3_1 = zx.d(*r3_1)
                        
                        if (r3_1 == 0x2d)
                            goto label_dcb84
                        
                        r3_1 = r7_1
                        r1_2 += 1
                        goto label_dcb30
                    case 0x24
                        r0_5 = 1
                        r3_1 = r7_1
                        r4_1 = 1
                        
                        if (zx.d(r2[2]) == 0)
                            goto label_dcb30
                        
                        r6_3 = 0xffffffff
                    case 0x27
                        goto label_dcacc
                    case 0x31
                        r0_5 = 1
                        r3_1 = r7_1
                        
                        if (zx.d(r2[2]) == 0)
                            goto label_dcb30
                        
                        r6_3 = 0xffffffff
        
        void* r5_9 = *(r0_3 - (r6_3 << 2))
        fprintf(__sF + 0xa8, "%s: ", data_1e205c, r3_1)
        fflush(__sF + 0xa8)
        uint32_t r0_101 = zx.d(*(r5_9 + 1))
        char const* const format
        
        if (r0_101 != 0x6c && r0_101 != 0x65)
            format = "unrecognized option '%s'\n"
        else
            format = "'%s' needs argument\n"
        
        fprintf(__sF + 0xa8, format, r5_9)
        fflush(__sF + 0xa8)
        fprintf(__sF + 0xa8, 
            "usage: %s [options] [script [args]]\nAvailable options are:\n  -e stat  execute string "
        "'stat'\n  -i       enter interactive mode after executing 'script'\n  -l name  require "
        "library 'name'\n  -v       show version information\n  -E       ignore environment "
        "variables\n  --       stop handling options\n  -        stop handling options and execute "
        "stdin\n", 
            data_1e205c)
        fflush(__sF + 0xa8)
    label_dd354:
        return 0
    
    if (r0_5 != 0)
        fwrite("Lua 5.2.3  Copyright (C) 1994-2013 Lua.org, PUC-Rio", 1, 0x33, __sF + 0x54)
        fputc(0xa, __sF + 0x54)
        fflush(__sF + 0x54)
        r4 = 0
    
    if (r7_1 != 0)
        lua_pushboolean(arg1, 1)
        lua_setfield(arg1, 0xfff0b9d8, "LUA_NOENV")
        r8 = 0

int128_t q0
q0.q = 0x407f600000000000
unimplemented  {vmov r2, r3, d0}
luaL_checkversion_(arg1)
lua_gc(arg1, 0, 0)
luaL_openlibs(arg1)
lua_gc(arg1, 1, 0)
int32_t result
int32_t var_44

if (r8 == 0)
label_dcda4:
    int32_t r1_9 = r0_1
    
    if (var_30 s> 0)
        r1_9 = var_30
    
    if (r1_9 s< 2)
    label_dcfa8:
        int32_t r5_6 = var_30
        
        if (r5_6 == 0)
        label_dd234:
            
            if (var_34 != 0)
                sub_dd4d0(arg1)
            else
                int32_t r0_92 = r5 | r5_6
                
                if (r0_92 != 0)
                    r0_92 = 1
                
                if (((r4 ^ 1) | r0_92) == 0)
                    fwrite("Lua 5.2.3  Copyright (C) 1994-2013 Lua.org, PUC-Rio", 1, 0x33, 
                        __sF + 0x54)
                    fputc(0xa, __sF + 0x54)
                    fflush(__sF + 0x54)
                    sub_dd4d0(arg1)
            
            result = 1
            lua_pushboolean(arg1, 1)
        else
            int32_t r6_9 = 0
            int32_t i
            
            do
                i = r0_3[r6_9]
                r6_9 += 1
            while (i != 0)
            int32_t r4_2 = r6_9 - r5_6
            luaL_checkstack(arg1, r4_2 + 1, "too many arguments to script")
            
            if (r6_9 - 1 s> r5_6 + 1)
                int32_t i_1 = r5_6 + 1
                
                do
                    lua_pushstring(arg1, r0_3[i_1])
                    i_1 += 1
                while (r6_9 - 1 != i_1)
            
            lua_createtable(arg1, r4_2 - 2, r5_6 + 1)
            
            if (r6_9 != 1)
                int32_t i_2 = 0
                
                do
                    lua_pushstring(arg1, r0_3[i_2])
                    lua_rawseti(arg1, 0xfffffffe, 0 - var_30 + i_2)
                    i_2 += 1
                while (r6_9 - 1 != i_2)
            
            lua_setglobal(arg1, 0x1c1b0f)
            char* s1 = r0_3[var_30]
            
            if (strcmp(s1, "-") == 0 && strcmp(*(&r0_3[var_30] - 4), "--") != 0)
                s1 = nullptr
            
            int32_t r0_68 = luaL_loadfilex(arg1, s1, 0)
            lua_insert(arg1, var_30 - r6_9 + 1)
            
            if (r0_68 == 0)
                int32_t r0_72 = lua_gettop(arg1)
                lua_pushcclosure(arg1, sub_dd990, 0)
                lua_insert(arg1, r0_72 + var_30 - r6_9 + 2)
                data_1e40f0 = arg1
                bsd_signal(2, sub_dda28)
                int32_t r0_78 =
                    lua_pcallk(arg1, r4_2 - 2, 0xffffffff, r0_72 + var_30 - r6_9 + 2, 0, 0)
                bsd_signal(2, nullptr)
                lua_remove(arg1, r0_72 + var_30 - r6_9 + 2)
                r5_6 = var_30
                
                if (r0_78 == 0)
                    goto label_dd234
            else
                lua_settop(arg1, var_30 - r6_9 + 1)
            
            result = 0
            
            if (lua_type(arg1, 0xffffffff) != 0)
                goto label_dd1a8
    else
        int32_t r10_1 = 1
        int32_t r4_6
        
        while (true)
            void* r8_1 = r0_3[r10_1]
            int32_t r0_30 = sx.d(*(r8_1 + 1))
            
            if (r0_30 == 0x6c)
                void* r8_2 = r8_1 + 2
                uint32_t r0_43 = zx.d(*r8_2)
                
                if (r0_43 == 0)
                    r10_1 += 1
                
                if (r0_43 == 0)
                    r8_2 = r0_3[r10_1]
                
                lua_getglobal(arg1, "require")
                lua_pushstring(arg1, r8_2)
                int32_t r0_47 = lua_gettop(arg1)
                lua_pushcclosure(arg1, sub_dd990, 0)
                lua_insert(arg1, r0_47 - 1)
                data_1e40f0 = arg1
                bsd_signal(2, sub_dda28)
                var_44 = 0
                int32_t r0_51 = lua_pcallk(arg1, 1, 1, r0_47 - 1, 0, 0)
                bsd_signal(2, nullptr)
                lua_remove(arg1, r0_47 - 1)
                
                if (r0_51 != 0)
                    if (lua_type(arg1, 0xffffffff) == 0)
                        goto label_dd354
                    
                    r4_6 = arg1
                    result = 0
                    goto label_dd384
                
                lua_setglobal(arg1, r8_2)
            else if (r0_30 == 0x65)
                void* s_1 = r8_1 + 2
                
                if (zx.d(*s_1) == 0)
                    r10_1 += 1
                    s_1 = r0_3[r10_1]
                
                int32_t r0_35 =
                    luaL_loadbufferx(arg1, s_1, strlen(s_1), "=(command line)", 0, var_44)
                int32_t r0_41
                
                if (r0_35 == 0)
                    int32_t r0_37 = lua_gettop(arg1)
                    lua_pushcclosure(arg1, sub_dd990, 0)
                    lua_insert(arg1, r0_37)
                    data_1e40f0 = arg1
                    bsd_signal(2, sub_dda28)
                    var_44 = 0
                    r0_41 = lua_pcallk(arg1, 0, 0, r0_37, 0, 0)
                    bsd_signal(2, nullptr)
                    lua_remove(arg1, r0_37)
                
                if (r0_35 != 0 || r0_41 != 0)
                    r4_6 = arg1
                    result = 0
                    
                    if (lua_type(r4_6, 0xffffffff) == 0)
                        return result
                    
                label_dd384:
                    char* r0_109 = lua_tolstring(r4_6, 0xffffffff, 0)
                    char const* const r5_10 = "(error object is not a string)"
                    
                    if (r0_109 != 0)
                        r5_10 = r0_109
                    
                    void* r2_15 = data_1e205c
                    
                    if (r2_15 != 0)
                        fprintf(__sF + 0xa8, "%s: ", r2_15)
                        fflush(__sF + 0xa8)
                    
                    fprintf(__sF + 0xa8, "%s\n", r5_10)
                    fflush(__sF + 0xa8)
                    lua_settop(r4_6, 0xfffffffe)
                    break
            
            r10_1 += 1
            
            if (r10_1 s>= r1_9)
                goto label_dcfa8
        
        lua_gc(r4_6, 2, 0)
else
    char const* const r7_2 = "=LUA_INIT_5_2"
    char* s_2 = getenv("LUA_INIT_5_2")
    char* s = s_2
    char* s_3
    
    if (s_2 == 0)
        r7_2 = "=LUA_INIT"
        s_3 = getenv("LUA_INIT")
        s = s_3
    
    if (s_2 == 0 && s_3 == 0)
        goto label_dcda4
    
    if (zx.d(*s) == 0x40)
        result = 0
        
        if (luaL_loadfilex(arg1, &s[1], 0) != 0)
            goto label_dcd8c
        
        goto label_dccfc
    
    result = 0
    
    if (luaL_loadbufferx(arg1, s, strlen(s), r7_2, 0) == 0)
    label_dccfc:
        int32_t r0_21 = lua_gettop(arg1)
        lua_pushcclosure(arg1, sub_dd990, 0)
        lua_insert(arg1, r0_21)
        data_1e40f0 = arg1
        bsd_signal(2, sub_dda28)
        var_44 = 0
        int32_t r0_25 = lua_pcallk(arg1, 0, 0, r0_21, 0, 0)
        bsd_signal(2, nullptr)
        lua_remove(arg1, r0_21)
        
        if (r0_25 == 0)
            goto label_dcda4
        
        goto label_dcd8c
    
label_dcd8c:
    
    if (lua_type(arg1, 0xffffffff) != 0)
        result = 0
    label_dd1a8:
        char* r0_83 = lua_tolstring(arg1, 0xffffffff, 0)
        char const* const r5_7 = "(error object is not a string)"
        
        if (r0_83 != 0)
            r5_7 = r0_83
        
        void* r2_10 = data_1e205c
        
        if (r2_10 != 0)
            fprintf(__sF + 0xa8, "%s: ", r2_10)
            fflush(__sF + 0xa8)
        
        fprintf(__sF + 0xa8, "%s\n", r5_7)
        fflush(__sF + 0xa8)
        lua_settop(arg1, 0xfffffffe)
        lua_gc(arg1, 2, 0)
return result
