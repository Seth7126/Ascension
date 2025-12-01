// 函数: _ZN14ascensionrules27CStateProcessBanishSequence10EnterStateER13CStateMachine
// 地址: 0x1363d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r1 = *(arg1 + 0x34)
void* r7 = *(r1 + 0xc)
core::CCardInstance* r5 = *(*(arg1 + 0x30) + 4)
uint32_t result
struct Elf32_Header* const r2_1

if (*(r7 + 0xf8) == 0)
    result = 9
    r2_1 = &__elf_header
else
    *(arg1 + 0x40) = 1
    ascension::CWorld::PushResolveEffect(r5, r1)
    result = 0xb
    r2_1 = nullptr

int32_t var_38_1
uint32_t result_1
uint32_t var_2c_1
int32_t var_28_1
char const* const r1_9
int32_t r3_3
int32_t r4_1

switch (*(arg1 + 0x38) - 1)
    case 0
        int32_t r3_2 = zx.d(*(*(arg1 + 0x30) + 8))
        var_38_1 = r3_2
        result_1 = result
        var_2c_1 = r2_1 | 2
        var_28_1 = r3_2
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x34), 6, 1, var_38_1, result_1, 0, 
            var_2c_1)
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x30))
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveOwnedCard(*(arg1 + 0x30))
        r4_1 = *(arg1 + 0x30)
        r3_3 = (*(**(arg1 + 0x34) + 0xc))()
        r1_9 = "%s banishes %s from hand\n"
    label_1365c4:
        core::CWorldBase::OutputMessageFormat(r5, r1_9, r4_1 + 0x10, r3_3, var_38_1, result_1, 0, 
            var_2c_1, var_28_1)
        goto label_13667c
    case 1
        int32_t r3_5 = zx.d(*(*(arg1 + 0x30) + 8))
        var_38_1 = r3_5
        result_1 = result
        var_2c_1 = r2_1 | 2
        var_28_1 = r3_5
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x34), 6, 2, var_38_1, result_1, 0, 
            var_2c_1)
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveCardFromDeck(*(arg1 + 0x30))
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveOwnedCard(*(arg1 + 0x30))
        r4_1 = *(arg1 + 0x30)
        r3_3 = (*(**(arg1 + 0x34) + 0xc))()
        r1_9 = "%s banishes %s from deck\n"
        goto label_1365c4
    case 2
        int32_t r3_7 = zx.d(*(*(arg1 + 0x30) + 8))
        var_38_1 = r3_7
        result_1 = result
        var_2c_1 = r2_1 | 2
        var_28_1 = r3_7
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x34), 6, 3, var_38_1, result_1, 0, 
            var_2c_1)
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveCardFromDiscard(*(arg1 + 0x30))
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveOwnedCard(*(arg1 + 0x30))
        r4_1 = *(arg1 + 0x30)
        r3_3 = (*(**(arg1 + 0x34) + 0xc))()
        r1_9 = "%s banishes %s from discard\n"
        goto label_1365c4
    case 6
        uint32_t var_28_2 = zx.d(*(*(arg1 + 0x30) + 8))
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x34), 6, 7, *(arg1 + 0x3c), result, 0, 
            r2_1 | 1)
    label_13667c:
        int32_t r0_24 = *(arg1 + 0x30)
        *(arg1 + 0x98) = *(arg1 + 0x38)
        
        if (r0_24 == *(r5 + 0xb20))
            ascension::CWorld::AddToBanishedCardCount()
        
        *(arg1 + 0x34)
        ascension::CWorld::PutCardInVoid(r5)
        *(arg1 + 0x34)
        ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 6)
        result = zx.d(*(arg1 + 0x40))
        
        if (result != 0)
            ascension::CWorld::OutputPauseForAnimationToDestination(r5)
            ascensionrules::CreateStateProcessCardEffect(r5, *(arg1 + 0x30), *(r7 + 0xf8), 
                *(arg1 + 0x34), arg1 + 0x44, nullptr, 0)
            CState* entry_r1
            return CStateMachine::PushOwnedState(entry_r1) __tailcall
    case 9
        uint32_t var_34_2
        uint32_t var_2c_3
        
        if (zx.d(*(arg1 + 0x40)) == 0)
            int32_t var_38_4 = 0
            var_34_2 = 9
            int32_t var_30_2 = 0
            var_2c_3 = &__elf_header
        else
            int32_t var_38_3 = 0
            var_34_2 = 0xb
            int32_t var_30_1 = 0
            var_2c_3 = 0
        
        int32_t var_28_3 = 0
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x34), 6, 0xa, 0, var_34_2, 0, var_2c_3)
        ascension::CWorld::SetPlayedCardsFlags(r5, *(arg1 + 0x34))
        *(arg1 + 0x34)
        ascension::CPlayer::RemoveOwnedCard(*(arg1 + 0x30))
        goto label_13667c

return result
