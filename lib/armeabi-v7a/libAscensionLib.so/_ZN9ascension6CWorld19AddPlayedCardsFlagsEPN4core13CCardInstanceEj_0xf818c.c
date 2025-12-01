// 函数: _ZN9ascension6CWorld19AddPlayedCardsFlagsEPN4core13CCardInstanceEj
// 地址: 0xf818c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0
int32_t r2 = *(arg1 + 0xb80)
int32_t r3 = *(arg1 + 0xb84)

if (r3 != r2)
    int32_t r7_1 = 0
    
    while (true)
        if (zx.d(*(*(r2 + (r7_1 << 3)) + 8)) == zx.d(*(arg2 + 8)))
            void* r0_3 =
                core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].file_size:3)
            int32_t* r1_3
            int32_t r2_1
            
            if (r0_3 == 0)
                r1_3 = *(arg1 + 0xb80) + (r7_1 << 3) + 4
                r2_1 = *r1_3
            else
                *(r0_3 + 0x10) = r7_1
                r1_3 = *(arg1 + 0xb80) + (r7_1 << 3) + 4
                r2_1 = *r1_3
                *(r0_3 + 0xc) = r2_1
            
            int32_t entry_r2
            *r1_3 = r2_1 | entry_r2
            int32_t var_2c_1 = 0x2b
            int32_t var_30 = 0x8000003
            int32_t var_28_1 = 2
            int32_t var_24_1 = r7_1
            int32_t var_20_1 = 0
            core::CWorldBase::SendStateChange(arg1, &var_30)
            result = 1
            break
        
        r7_1 += 1
        
        if (r7_1 u>= (r3 - r2) s>> 3)
            result = 0
            break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
