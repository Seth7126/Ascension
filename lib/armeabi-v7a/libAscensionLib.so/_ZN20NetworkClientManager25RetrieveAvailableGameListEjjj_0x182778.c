// 函数: _ZN20NetworkClientManager25RetrieveAvailableGameListEjjj
// 地址: 0x182778
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

while (true)
    int32_t r1 = *(arg1 + 0xd0)
    int32_t* r2 = *(arg1 + 0xd4)
    void* i
    
    do
        if (r1 == r2)
            int32_t result = 0
            
            if (zx.d(*(arg1 + 0x8e)) != 0)
                int32_t* r0_2 = *(arg1 + 4)
                
                if (r0_2 != 0)
                    result = 1
                    *(arg1 + 0xcf) = 1
                    int32_t var_34_1 = 0
                    int32_t var_38 = 0x1001
                    uint32_t var_30_1 = arg2
                    uint32_t var_2c_1 = arg3
                    int32_t r3
                    int32_t var_28_1 = r3
                    (*(*r0_2 + 8))(r0_2, &var_38, 0x14)
            
            if (*__stack_chk_guard == r0)
                return result
            
            __stack_chk_fail()
            noreturn
        
        r2 -= 4
        i = *r2
        *(arg1 + 0xd4) = r2
    while (i == 0)
    
    operator delete(i)
