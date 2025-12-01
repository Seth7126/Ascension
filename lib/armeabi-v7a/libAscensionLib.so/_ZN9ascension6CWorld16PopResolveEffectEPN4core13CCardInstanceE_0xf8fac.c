// 函数: _ZN9ascension6CWorld16PopResolveEffectEPN4core13CCardInstanceE
// 地址: 0xf8fac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t entry_r1

if (*(*(arg1 + 0xbdc) - 8) == entry_r1)
    void* r0_4 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].memory_size:1)
    int32_t r1_1
    
    if (r0_4 == 0)
        r1_1 = *(arg1 + 0xbdc) - *(arg1 + 0xbd8)
    else
        int32_t r1 = *(arg1 + 0xbdc)
        *(r0_4 + 0xc) = zx.d(*(*(r1 - 8) + 8))
        *(r0_4 + 0x10) = *(r1 - 4)
        r1_1 = r1 - *(arg1 + 0xbd8)
        *(r0_4 + 0x14) = -1 + (r1_1 u>> 3).w
        *(r0_4 + 0x16) = (r1_1 u>> 3).w
    
    int32_t var_24_1 = 0x2c
    int32_t var_28 = 0x8000003
    int32_t var_20_1 = 2
    int32_t var_1c_1 = 0xffffffff + (r1_1 s>> 3)
    int32_t var_18_1 = 0
    core::CWorldBase::SendStateChange(arg1, &var_28)
    *(arg1 + 0xbdc) -= 8

int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
