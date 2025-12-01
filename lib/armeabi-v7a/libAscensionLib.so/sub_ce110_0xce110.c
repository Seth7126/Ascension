// 函数: sub_ce110
// 地址: 0xce110
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = arg3
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = lua_gettop(arg1)
int32_t result

if (r0_2 == r5)
    result = 1
else
    uint32_t r10_1 = 1
    
    do
        if (lua_type(arg1, r5) != 3)
            uint32_t count
            void* r0_11 = luaL_checklstring(arg1, r5, &count)
            
            if (r10_1 == 0)
                r10_1 = 0
            else
                int32_t temp0_1 = 0
                uint32_t i = fwrite(r0_11, 1, count, arg2) - count
                
                while (i != 0)
                    i u>>= 1
                    temp0_1 += 1
                
                r10_1 = (0x20 - temp0_1) u>> 5
        else if (r10_1 == 0)
            r10_1 = 0
        else
            int32_t r0_7
            int32_t r1_2
            r0_7, r1_2 = lua_tonumberx(arg1, r5, 0)
            r10_1 = 0
            
            if (fprintf(arg2, "%.14g", r0_7, r1_2) s> 0)
                r10_1 = 1
        
        r5 += 1
    while (r0_2 != r5)
    
    result = 1
    
    if (r10_1 == 0)
        result = luaL_fileresult(arg1, 0, 0)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
