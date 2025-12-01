// 函数: _ZN9ascension6CWorld29PutPlayedCardsIntoDiscardPileEPNS_7CPlayerE
// 地址: 0xf83a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r6 = *(arg1 + 0xb84) - *(arg1 + 0xb80)
void* r0_3 =
    core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[0].physical_address:1)

if (r0_3 != 0)
    int32_t r1_1 = r6 s>> 3
    *(r0_3 + 0xc) = r1_1
    void* r12_1
    
    if (r6 s<= 0)
        r12_1 = r0_3 + 0x10
    else
        int32_t r6_1 = *(arg1 + 0xb80)
        r12_1 = r0_3 + 0x10
        int32_t r7_1 = 0
        
        do
            void* r2_1 = r0_3 + (r7_1 << 3)
            int32_t* r3_2 = r6_1 + (r7_1 << 3)
            r7_1 += 1
            *(r2_1 + 0x10) = zx.d(*(*r3_2 + 8))
            *(r2_1 + 0x14) = r3_2[1]
        while (r7_1 s< r1_1)
    
    void* r12_2 = r12_1 + (r1_1 << 3)
    *r12_2 = 0
    *(r12_2 + 4) = 0

int32_t var_48

for (int32_t i = *(arg1 + 0xb84); *(arg1 + 0xb80) != i; i = *(arg1 + 0xb84))
    void* r7_2 = *(i - 8)
    int32_t r0_8 = *(i - 4)
    *(arg1 + 0xb84) = i - 8
    uint32_t var_40
    core::CCardInstance* entry_r1
    
    if ((r0_8 & 2) != 0)
        uint32_t r1_7 = zx.d(*(r7_2 + 8))
        int32_t var_44_3 = 0x22
        var_48 = 0x8000003
        var_40 = r1_7
        int32_t var_3c_3 = 0
        int32_t var_38_3 = r0_8
        core::CWorldBase::SendStateChange(arg1, &var_48)
        
        if (*(arg1 + 0x30) u<= 8)
            ascension::CPlayer::RemoveOwnedCard(entry_r1)
    else if ((r0_8 & 0x80) != 0 || (r0_8 & 0x20) != 0)
    label_f84ec:
        uint32_t r1_5 = zx.d(*(r7_2 + 8))
        int32_t var_44_2 = 0x22
        var_48 = 0x8000003
        var_40 = r1_5
        int32_t var_3c_2 = 0
        int32_t var_38_2 = r0_8
        core::CWorldBase::SendStateChange(arg1, &var_48)
    else if ((r0_8 & 0x10) != 0)
        uint32_t r0_18 = zx.d(*(entry_r1 + 8))
        var_48 = 0x8000001
        int32_t var_44_5 = 0xa000101
        var_40.b = 1
        uint32_t var_3c_5 = r0_18
        uint32_t var_38_5 = r0_18
        
        if (r7_2 != 0)
            r0_18 = zx.d(*(r7_2 + 8))
        
        int32_t var_30_3 = 0
        
        if (r7_2 == 0)
            r0_18 = 0
        
        uint32_t var_34_3 = r0_18
        int32_t var_2c_3 = 0
        core::CWorldBase::SendStateChange(arg1, &var_48)
        ascension::CPlayer::PutCardInHand(entry_r1)
    else
        if ((r0_8 & 1) != 0 || (r0_8 & 0x400) != 0)
            goto label_f84ec
        
        if ((r0_8 & 4) == 0)
            uint32_t r0_13 = zx.d(*(entry_r1 + 8))
            
            if (*(*(r7_2 + 0xc) + 0x88) != 5)
                var_48 = 0x8000001
                int32_t var_44_1 = 0xa000001
                var_40.b = 3
                uint32_t var_3c_1 = r0_13
                uint32_t var_38_1 = r0_13
                int32_t var_30_1 = 0
                uint32_t var_34_1 = zx.d(*(r7_2 + 8))
                int32_t var_2c_1 = 0
                core::CWorldBase::SendStateChange(arg1, &var_48)
                ascension::CPlayer::PutCardInDiscard(entry_r1)
            else
                var_48 = 0x8000001
                int32_t var_44_4 = 0xa000001
                var_40.b = 9
                uint32_t var_3c_4 = r0_13
                int32_t var_38_4 = 0
                uint32_t var_34_2 = zx.d(*(r7_2 + 8))
                struct Elf32_Header* const var_30_2 = &__elf_header
                int32_t var_2c_2 = 0
                core::CWorldBase::SendStateChange(arg1, &var_48)
                ascension::CWorld::PutCardInVoid(arg1)

int32_t var_44_6 = 0x2b
var_48 = 0x8000003
int32_t var_40_1 = 0
int32_t var_3c_6 = 0
int32_t var_38_6 = 0
core::CWorldBase::SendStateChange(arg1, &var_48)
int32_t r0_23 = *__stack_chk_guard

if (r0_23 == r0)
    return r0_23 - r0

__stack_chk_fail()
noreturn
