// 函数: sub_dd4d0
// 地址: 0xdd4d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r2 = data_1e205c
data_1e205c = nullptr
lua_settop(arg1, 0)

if (sub_dda94(arg1, 1) != 0)
    while (true)
        int32_t var_3c
        int32_t var_30
        uint32_t i_2 = luaL_loadbufferx(arg1, lua_tolstring(arg1, 1, &var_30), var_30, "=stdin", 0, 
            var_3c, r2, __sF + 0xa8)
        uint32_t i_1 = i_2
        
        if (i_2 == 3)
            while (true)
                int32_t var_2c
                int32_t r0_9 = lua_tolstring(arg1, 0xffffffff, &var_2c)
                int32_t r1_2 = var_2c
                
                if (r1_2 u>= 5 && strcmp(r0_9 + r1_2 - 5, "<eof>") == 0)
                    lua_settop(arg1, 0xfffffffe)
                    
                    if (sub_dda94(arg1, 0) == 0)
                        goto label_dd8d8
                    
                    lua_pushlstring(arg1, &data_1c1aa6, 1)
                    lua_insert(arg1, 0xfffffffe)
                    lua_concat(arg1, 3)
                    uint32_t i_3 =
                        luaL_loadbufferx(arg1, lua_tolstring(arg1, 1, &var_30), var_30, "=stdin", 0)
                    
                    if (i_3 == 3)
                        continue
                    
                    i_1 = i_3
                    goto label_dd644
                
                lua_remove(arg1, 1)
                i_1 = 3
                break
            
            goto label_dd708
        
    label_dd644:
        lua_remove(arg1, 1)
        uint32_t r8_1
        
        if (i_1 != 0)
            if (i_1 == 0xffffffff)
                break
            
        label_dd708:
            int32_t temp0_1 = 0
            uint32_t i = i_1
            
            while (i != 0)
                i u>>= 1
                temp0_1 += 1
            
            r8_1 = (0x20 - temp0_1) u>> 5
            goto label_dd718
        
        int32_t r0_24 = lua_gettop(arg1)
        r8_1 = 0
        lua_pushcclosure(arg1, sub_dd990, 0)
        lua_insert(arg1, r0_24)
        data_1e40f0 = arg1
        bsd_signal(2, sub_dda28)
        var_3c = 0
        int32_t r0_28 = lua_pcallk(arg1, 0, 0xffffffff, r0_24, 0, 0)
        bsd_signal(2, nullptr)
        lua_remove(arg1, r0_24)
        
        if (r0_28 != 0)
        label_dd718:
            
            if (lua_type(arg1, 0xffffffff) != 0)
                char* r0_35 = lua_tolstring(arg1, 0xffffffff, 0)
                char const* const r7_1 = r0_35
                void* r2_6 = data_1e205c
                
                if (r0_35 == 0)
                    r7_1 = "(error object is not a string)"
                
                if (r2_6 != 0)
                    fprintf(__sF + 0xa8, "%s: ", r2_6)
                    fflush(__sF + 0xa8)
                
                fprintf(__sF + 0xa8, "%s\n", r7_1)
                fflush(__sF + 0xa8)
                lua_settop(arg1, 0xfffffffe)
                lua_gc(arg1, 2, 0)
            
            if (r8_1 != 0)
                goto label_dd7b8
        else
        label_dd7b8:
            
            if (lua_gettop(arg1) s>= 1)
                luaL_checkstack(arg1, 0x14, "too many results to print")
                lua_getglobal(arg1, "print")
                lua_insert(arg1, 1)
                var_3c = 0
                
                if (lua_pcallk(arg1, lua_gettop(arg1) - 1, 0, 0, 0, 0) != 0)
                    void* r7_2 = data_1e205c
                    int32_t r0_54 = lua_pushfstring(arg1, "error calling 'print' (%s)", 
                        lua_tolstring(arg1, 0xffffffff, 0))
                    
                    if (r7_2 != 0)
                        fprintf(__sF + 0xa8, "%s: ", r7_2)
                        fflush(__sF + 0xa8)
                    
                    fprintf(__sF + 0xa8, "%s\n", r0_54)
                    fflush(__sF + 0xa8)
        
        lua_settop(arg1, 0)
        
        if (sub_dda94(arg1, 1) == 0)
            break

label_dd8d8:
lua_settop(arg1, 0)
fputc(0xa, __sF + 0x54)
fflush(__sF + 0x54)
data_1e205c = r2
int32_t r0_64 = *__stack_chk_guard

if (r0_64 == r0)
    return r0_64 - r0

__stack_chk_fail()
noreturn
