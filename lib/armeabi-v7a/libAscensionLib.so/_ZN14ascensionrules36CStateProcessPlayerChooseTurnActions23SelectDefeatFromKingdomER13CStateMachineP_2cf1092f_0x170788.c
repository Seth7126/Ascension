// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions23SelectDefeatFromKingdomER13CStateMachineP6CStateiPj
// 地址: 0x170788
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
uint32_t r7 = *(r8 + 4)
int32_t r0_1 = core::CWorldBase::GetInstanceByID(r7)

if (*(r0_1 + 0x10) s>= 1)
    core::CCardStackUniform::SetCardCount(r0_1)

int32_t result = *(arg2 + 0xcb4)

if (result s>= 1)
    core::CCardInstance* r5_1 = *(r0_1 + 0x14)
    void* __offset(CState, 0xcc4) r1_2 = arg2 + 0xcc4
    int32_t r2 = 0
    
    do
        if (r5_1 == *(r1_2 - 0xc))
            int32_t r9 = *r1_2
            int32_t r1_3 = *(r5_1 + 0xc)
            int32_t var_34
            int32_t var_30
            int32_t var_2c
            
            if (zx.d(*(r7 + 0xb29)) != 0 && *(r7 + 0xb40) s>= 1 && *(r7 + 0x30) u>= 0x18)
                var_34 = 4
                var_30 = 0
                var_2c = 0
                ascensionrules::CreateStateMustPayResources(r8, r5_1, 0, r9, 0, 4, 0, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
            else if (r9 s<= *(r7 + 0xb48))
                ascension::CWorld::RemoveCurrentTurnPower(r7)
            else
                ascension::CWorld::RemoveCurrentTurnPower(r7)
                ascension::CWorld::RemoveCurrentTurnRunes(r7)
            
            if (zx.d(*(r7 + 0xa14)) == 0)
                uint32_t r3_3 = core::CWorldBase::OutputMessageFormat(r7, 
                    "%s defeats %s (%d power)\n", r8 + 0x10, r1_3 + 4, r9, var_34, var_30, var_2c, 
                    r1_3)
                void* r0_16 = *(r0_1 + 0x14)
                
                if (r0_16 != 0)
                    r3_3 = zx.d(*(r0_16 + 8))
                
                int32_t var_38_2 = *(r0_1 + 0x10)
                
                if (r0_16 == 0)
                    r3_3 = 0
                
                ascension::CWorld::OutputEvent(r7, 0x21, zx.d(*(r0_1 + 8)), r3_3)
            
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStateDefeatMonsterFromKingdom(r8, r5_1, r0_1, false, 
                *(arg2 + 0x20), var_34)
            CState::SetEmbeddedState(arg2)
            return CStateList::AppendState(arg2) __tailcall
        
        r2 += 1
        r1_2 += 0x34
    while (r2 s< result)

return result
