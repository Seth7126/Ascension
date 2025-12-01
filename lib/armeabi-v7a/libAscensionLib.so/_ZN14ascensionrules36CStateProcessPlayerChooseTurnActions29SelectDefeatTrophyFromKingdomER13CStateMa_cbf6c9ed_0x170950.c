// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions29SelectDefeatTrophyFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x170950
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
char* r7 = *(r8 + 4)
int32_t r0_1 = core::CWorldBase::GetInstanceByID(r7)

if (*(r0_1 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(r0_1)

core::CInstance* r0_5
uint32_t r3
r0_5, r3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
void* r0_6 = *(r0_1 + 0x14)

if (r0_6 != 0)
    r3 = zx.d(*(r0_6 + 8))

int32_t var_38 = *(r0_1 + 0x10)

if (r0_6 == 0)
    r3 = 0

ascension::CWorld::OutputEvent(r7, 0x21, zx.d(*(r0_1 + 8)), r3)
int32_t result = *(arg2 + 0xcb4)

if (result s>= 1)
    int32_t r2_1 = 0
    void* __offset(CState, 0xcc4) r1_2 = arg2 + 0xcc4
    
    do
        if (r0_5 == *(r1_2 - 0xc))
            int32_t r9 = *r1_2
            int32_t var_34
            int32_t var_30
            int32_t var_2c
            
            if (zx.d(r7[0xb29]) != 0 && *(r7 + 0xb40) s>= 1 && *(r7 + 0x30) u>= 0x18)
                var_34 = 4
                var_30 = 0
                var_2c = 0
                ascensionrules::CreateStateMustPayResources(r8, r0_5, 0, r9, 0, 4, 0, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
            else if (r9 s<= *(r7 + 0xb48))
                ascension::CWorld::RemoveCurrentTurnPower(r7)
            else
                ascension::CWorld::RemoveCurrentTurnPower(r7)
                ascension::CWorld::RemoveCurrentTurnRunes(r7)
            
            core::CWorldBase::OutputMessageFormat(r7, "%s defeats %s (%d power)\n", r8 + 0x10, 
                (*(*r0_5 + 0xc))(r0_5), r9, var_34, var_30, var_2c)
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStateDefeatMonsterFromKingdom(r8, r0_5, r0_1, true, 
                *(arg2 + 0x20))
            CState::SetEmbeddedState(arg2)
            return CStateList::AppendState(arg2) __tailcall
        
        r2_1 += 1
        r1_2 += 0x34
    while (r2_1 s< result)

return result
