// 函数: _ZN20NetworkClientManager10DeleteGameEP12AppWorldData
// 地址: 0x182ac4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0

if (zx.d(*(arg1 + 0x8e)) != 0)
    int32_t* r2_1 = *(arg1 + 4)
    void* entry_r1
    
    if (r2_1 != 0 && *(entry_r1 + 0xa04) == 1)
        int32_t* i = *(arg1 + 0xdc)
        int32_t r3_1 = *(arg1 + 0xe0)
        
        if (r3_1 != i)
            void* i_1
            
            if (*i == entry_r1)
                i_1 = i
            label_182b70:
                int32_t var_2c_1 = 0
                int32_t var_30 = 0xfdfdfdfd
                int32_t var_28_1 = *(entry_r1 + 4)
                (*(*r2_1 + 8))(r2_1, &var_30, 0xc)
                int32_t r0_4 = *(arg1 + 0xe0)
                
                if (r0_4 != i_1 + 4)
                    __aeabi_memmove4(i_1)
                
                int32_t r2_4 = *(arg1 + 0x500)
                *(arg1 + 0xe0) = i_1 + ((r0_4 - (i_1 + 4)) s>> 2 << 2)
                
                if (r2_4 != 0)
                    r2_4(*(arg1 + 0x504), entry_r1)
                
                ClearAppWorldData(entry_r1)
                operator delete(entry_r1)
                result = 1
            else
                while (r3_1 - 4 != i)
                    i_1 = &i[1]
                    bool cond:0_1 = i[1] != entry_r1
                    i = i_1
                    
                    if (not(cond:0_1))
                        goto label_182b70

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
