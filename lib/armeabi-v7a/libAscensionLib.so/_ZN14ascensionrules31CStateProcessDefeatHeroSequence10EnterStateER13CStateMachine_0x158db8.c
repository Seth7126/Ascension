// 函数: _ZN14ascensionrules31CStateProcessDefeatHeroSequence10EnterStateER13CStateMachine
// 地址: 0x158db8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r0 = *(arg1 + 0x38)
void* r1 = *(arg1 + 0x3c)
int32_t r6 = 0
uint32_t r8 = *(r0 + 4)
ascension::CCard* r9 = *(r1 + 0xc)
*(arg1 + 0x140) = *(arg1 + 0x48)
int32_t var_50 = 0
ascension::CWorld::OutputEvent(r8, 0x18, zx.d(*(r0 + 8)), zx.d(*(r1 + 8)))
*(arg1 + 0x3c)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x38), 4)
ascension::CWorld::PushResolveEffect(r8, *(arg1 + 0x3c))
core::CCardInstance* r5 = nullptr

if (*(arg1 + 0x40) == 7)
    r6 = 0
    core::CCardInstance* r0_6 = ascension::CWorld::RemoveCenterRowCard(r8, (*(arg1 + 0x44)).b)
    *(arg1 + 0x44)
    r5 = r0_6
    int32_t* r0_8 = ascension::CWorld::GetCenterRowCardStackList(r8)
    
    if (r0_8 != 0)
        void* r1_4 = *r0_8
        int32_t r0_9 = r0_8[1]
        
        if (r1_4 != r0_9)
            r6 = 0
            
            do
                int32_t r2_5 = *(r1_4 + 4)
                r1_4 += 8
                
                if (r2_5 == 3)
                    r6 += 1
            while (r0_9 != r1_4)

bool* r1_5 = *(arg1 + 0x38)
int32_t r0_10 = *(arg1 + 0x3c)
int32_t r2_6 = *(arg1 + 0x40)
int32_t r3_1 = *(arg1 + 0x44)
int32_t r7_1 = *(arg1 + 0x48)
*(arg1 + 0xb4) = 1
*(arg1 + 0xb8) = arg1 + 0xbc
*(arg1 + 0x9c) = r1_5
*(arg1 + 0xa0) = r0_10
*(arg1 + 0xa4) = r2_6
*(arg1 + 0xa8) = r3_1
*(arg1 + 0xac) = r6
*(arg1 + 0xb0) = r7_1
int32_t var_50_1 = 1
ascension::CWorld::GetCenterRowDayNight(r8, r1_5, arg1 + 0xb6, arg1.b - 0x49)
ascension::CWorld::HandleEvent(r8)
ascension::CWorld::RemoveActiveEffectList(r8, zx.d(*(arg1 + 0x5a)))

if (zx.d(*(arg1 + 0x58)) != 0)
    ascensionrules::CreateStateHandleEvent(r8, arg1 + 0x50, false, 1, nullptr, 0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

uint32_t r1_11 = *(arg1 + 0x3c)
uint32_t r3_3 = *(arg1 + 0x40)
int32_t r0_19 = *(arg1 + 0x44)

if (zx.d(*(arg1 + 0x4d)) == 0)
    uint32_t var_40_1 = zx.d(*(*(arg1 + 0x38) + 8))
    ascension::CWorld::OutputAnimationCard(r8, r1_11, 4, r3_3, r0_19, 0xb, 0, 1)
else
    int32_t var_40 = 0
    ascension::CWorld::OutputAnimationCard(r8, r1_11, 4, r3_3, r0_19, 0xb, 0, 1)
    ascension::CWorld::OutputPauseForAllAnimation()

if (*(arg1 + 0x140) == 9)
    *(arg1 + 0x3c)
    ascension::CWorld::PutCardInVoid(r8)

if (*(arg1 + 0x40) == 7 && zx.d(*(arg1 + 0x4c)) != 0)
    ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x38), *(arg1 + 0x44), r5, false, true, 
        0, 0, false, nullptr, arg1 + 0xbc, 0xb, nullptr, 0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

if (zx.d(*(r9 + 0xc9)) == 0 && *(r9 + 0xe8) != 0)
    core::CInstance* r1_16 = *(arg1 + 0x3c)
    ascensionrules::CreateStateProcessCopyCardEffect(*(arg1 + 0x38), r9, zx.d(*(r1_16 + 8)), false, 
        false, r1_16)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

if (zx.d(*(arg1 + 0x58)) != 0)
    ascensionrules::CreateStateHandleEvent(r8, arg1 + 0x50, false, 0, nullptr, 0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

uint32_t result = *(arg1 + 0x40)

if (result == 7)
    result = zx.d(*(arg1 + 0x4c))
    
    if (result != 0)
        ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0xbc, 
            nullptr, 0)
        CState::AddOwnedChild(arg1)
        return CStateList::AppendState(arg1) __tailcall

return result
