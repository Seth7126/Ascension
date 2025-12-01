// 函数: _ZN9ascension6CWorld15AddActiveEffectEPNS_21CActiveEffectInstanceE
// 地址: 0xf6e50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = 0
int32_t r7 = 0
int32_t r0 = *__stack_chk_guard
void* entry_r1

if (*(arg1 + 0x30) u>= 6)
    r2 = *(*(entry_r1 + 0xc) + 0x18)

int32_t* r3 = *(arg1 + 0xaa4)
ascension::CActiveEffectInstance** r1 = *(arg1 + 0xaa8)

if (r1 == r3 || r2 s< *(*(*r3 + 0xc) + 0x18))
    r1 = r3
else
    void* r3_2 = &r3[1]
    int32_t r6_4 = 1
    
    while (true)
        r7 = r6_4
        
        if (r1 == r3_2)
            break
        
        void* r6_5 = *r3_2
        r3_2 += 4
        r6_4 = r7 + 1
        
        if (r2 s< *(*(r6_5 + 0xc) + 0x18))
            r1 = r3_2 - 4
            break

std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::insert(
    arg1 + 0xaa4, r1)
void* r0_6 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.section_header_count:1)

if (r0_6 != 0)
    uint32_t r1_2 = zx.d(*(entry_r1 + 8))
    *(r0_6 + 0x10) = r7.w
    *(r0_6 + 0xc) = r1_2
    *(r0_6 + 0x12) = ((*(arg1 + 0xaa8) - *(arg1 + 0xaa4)) u>> 2).w

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
