// 函数: _ZN9ascension6CWorld19SetPlayedCardsFlagsEPN4core13CCardInstanceEj
// 地址: 0xf807c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *(arg1 + 0xb80)
int32_t r1 = *(arg1 + 0xb84)

if (r1 != r0_1)
    int32_t i = 0
    
    do
        if (zx.d(*(*(r0_1 + (i << 3)) + 8)) == zx.d(*(arg2 + 8)))
            void* r0_3 =
                core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].file_size:3)
            int32_t* r1_3
            
            if (r0_3 == 0)
                r1_3 = *(arg1 + 0xb80) + (i << 3) + 4
            else
                *(r0_3 + 0x10) = i
                r1_3 = *(arg1 + 0xb80) + (i << 3) + 4
                *(r0_3 + 0xc) = *r1_3
            
            int32_t entry_r2
            *r1_3 = entry_r2
            int32_t var_3c = 0x8000003
            int32_t var_38_1 = 0x2b
            int32_t var_34_1 = 2
            int32_t i_1 = i
            int32_t var_2c_1 = 0
            core::CWorldBase::SendStateChange(arg1, &var_3c)
            r0_1 = *(arg1 + 0xb80)
            r1 = *(arg1 + 0xb84)
        
        i += 1
    while (i u< (r1 - r0_1) s>> 3)

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
