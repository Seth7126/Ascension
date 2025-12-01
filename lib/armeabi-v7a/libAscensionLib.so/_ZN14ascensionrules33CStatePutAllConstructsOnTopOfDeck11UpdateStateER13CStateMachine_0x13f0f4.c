// 函数: _ZN14ascensionrules33CStatePutAllConstructsOnTopOfDeck11UpdateStateER13CStateMachine
// 地址: 0x13f0f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int64_t* entry_r8
int64_t* var_14 = entry_r8
void* r4 = *(arg1 + 0x30)
int32_t r0_1 = *(r4 + 0x58) - *(r4 + 0x54)
CState* entry_r1

if (r0_1 s< 1)
    return CStateMachine::PopState(entry_r1)
int32_t* r5 = *(r4 + 4)
int32_t r0_3 = (*(*r5 + 0xc))(r5, r0_1 u>> 2)
int32_t r1_2 = *(r4 + 0x54)
int32_t temp1 = (*(r4 + 0x58) - r1_2) s>> 2

if (r0_3 u>= temp1)
    CStateMachine* r0_35
    char r3_4
    r0_35, r3_4 = std::__ndk1::__vector_base_common<true>::__throw_out_of_range()
    int32_t __saved_r11
    
    if (r0_3 == temp1)
        *entry_r8 = (&__saved_r11):(entry_r8 & ror.d(r0_35, zx.d(r3_4)))
    return ascensionrules::CStatePutAllConstructsOnTopOfDeck::ExitState(r0_35) __tailcall

void* r7 = *(r1_2 + (r0_3 << 2))
uint32_t r1_3 = *(r7 + 0x10)
void* r6_2 = *(r1_3 + 0xc)
int32_t var_3c = 2
uint32_t var_38 = zx.d(*(*(arg1 + 0x30) + 8))
int32_t var_34 = 0
uint32_t var_30 = 0
uint32_t var_40 = zx.d(*(r7 + 8))
uint32_t var_28 = r1_3
ascension::CWorld::OutputAnimationCard(r5, r1_3, 5, 4, var_40, 2, var_38, 0)
int32_t* i = *(r7 + 0x48)
int32_t r0_7 = *(r7 + 0x4c)

if (zx.d(*(r6_2 + 0xcb)) == 0)
    if (i != r0_7)
        do
            uint32_t r6_4 = *i
            i = &i[1]
            core::CWorldBase::OutputMessageFormat(r5, "%s puts %s into discard pile\n", 
                *(arg1 + 0x30) + 0x10, (*(*r6_4 + 0xc))(r6_4), var_40, var_3c, var_38, var_34, 
                var_30)
            uint32_t r0_23 = zx.d(*(*(arg1 + 0x30) + 8))
            var_40 = zx.d(*(r7 + 8))
            var_3c = 3
            var_38 = r0_23
            var_30 = r0_23
            var_34 = 3
            ascension::CWorld::OutputAnimationCard(r5, r6_4, 5, 4, var_40, 3, var_38, 3)
            ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
        while (i != *(r7 + 0x4c))
else if (i != r0_7)
    do
        int32_t* r6_3 = *i
        i = &i[1]
        core::CWorldBase::OutputMessageFormat(r5, "%s puts %s on top of portal deck\n", 
            *(arg1 + 0x30) + 0x10, (*(*r6_3 + 0xc))(r6_3), var_40, var_3c, var_38, 0, 0)
        var_40 = zx.d(*(r7 + 8))
        var_3c = 8
        var_38 = 0
        int32_t var_30_1 = 0
        ascension::CWorld::OutputAnimationCard(r5, r6_3, 5, 4, var_40, 8, 0, 0)
        ascension::CWorld::PutCardOnTopOfPortalDeck(r5)
    while (i != *(r7 + 0x4c))

if (ascension::CPlayer::RemoveConstructFromPlay(*(arg1 + 0x30)) != 0)
    ascension::CPlayer::PutCardOnTopOfDeck(*(arg1 + 0x30))

int32_t result = r5[0x2c4]

if (result u>= 7)
    *(arg1 + 0x30)
    int32_t r0_31 = ascension::CWorld::QueryCenterRowSize(r5)
    result = r5[0x2c4]
    
    if (result != r0_31)
        return ascension::CWorld::SetCenterRowSize(r5) __tailcall

return result
