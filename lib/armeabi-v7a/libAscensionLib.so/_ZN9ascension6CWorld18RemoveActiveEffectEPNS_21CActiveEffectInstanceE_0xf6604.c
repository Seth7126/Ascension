// 函数: _ZN9ascension6CWorld18RemoveActiveEffectEPNS_21CActiveEffectInstanceE
// 地址: 0xf6604
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1
void* var_28 = entry_r1
int32_t* r6 = *(arg1 + 0xaa4)
int32_t r0_1 = *(arg1 + 0xaa8)

if (r0_1 != r6)
    int32_t r7_1
    
    if (*r6 == entry_r1)
        r7_1 = 0
    else
        r7_1 = 0
        void* r1_1
        bool cond:0_1
        
        do
            if (r0_1 - 4 == r6)
                goto label_f671c
            
            r1_1 = &r6[1]
            r7_1 += 1
            cond:0_1 = r6[1] != entry_r1
            r6 = r1_1
        while (cond:0_1)
        r6 = r1_1
    
    uint32_t r9_1 = 0
    void* r0_4 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.string_table)
    int32_t r2_2
    
    if (r0_4 == 0)
        r2_2 = *(arg1 + 0xaa8)
    else
        if (entry_r1 != 0)
            r9_1 = zx.d(*(entry_r1 + 8))
        
        *(r0_4 + 0x10) = r7_1.w
        *(r0_4 + 0xc) = r9_1
        r2_2 = *(arg1 + 0xaa8)
        *(r0_4 + 0x12) = ((r2_2 - *(arg1 + 0xaa4)) u>> 2).w
    
    if (r2_2 != &r6[1])
        __aeabi_memmove4(r6)
    
    int32_t* r0_6 = *(arg1 + 0xab4)
    int32_t r1_6 = *(arg1 + 0xab8)
    *(arg1 + 0xaa8) = &r6[(r2_2 - &r6[1]) s>> 2]
    
    if (r0_6 == r1_6)
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
            arg1 + 0xab0)
    else
        *r0_6 = entry_r1
        *(arg1 + 0xab4) += 4

label_f671c:
int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
