// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions25SelectDefeatHeroWithPowerER13CStateMachineP6CStateiPj
// 地址: 0x175390
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r9 = *(arg2 + 0x24c)
int32_t r7 = *(r9 + 4)
core::CInstance* r0_1 = core::CWorldBase::GetInstanceByID(r7)
int32_t r4 = 0
int32_t result = ascension::CWorld::GetCenterRowCard(r7)

if (result != r0_1)
    r4 = 1
    result = ascension::CWorld::GetCenterRowCard(r7)
    
    if (result != r0_1)
        r4 = 2
        result = ascension::CWorld::GetCenterRowCard(r7)
        
        if (result != r0_1)
            r4 = 3
            result = ascension::CWorld::GetCenterRowCard(r7)
            
            if (result != r0_1)
                r4 = 4
                result = ascension::CWorld::GetCenterRowCard(r7)
                
                if (result != r0_1)
                    r4 = 5
                    result = ascension::CWorld::GetCenterRowCard(r7)
                    
                    if (result != r0_1)
                        result = ascension::CWorld::GetCenterRowCard(r7)
                        r4 = 7
                        
                        if (result == r0_1)
                            r4 = 6

if (r0_1 == 0)
    return result

int32_t r0_9 = *(r7 + 0x30)
int32_t r1_8 = 0x98
int32_t* r8 = *(r0_1 + 0xc)

if (r0_9 u< 0x14)
    r1_8 = 0x9c

int32_t r5 = *(r8 + r1_8)
int32_t var_3c
int32_t var_38
int32_t var_34

if (zx.d(*(r7 + 0xb29)) != 0 && r0_9 u>= 0x17 && *(r7 + 0xb40) s>= 1)
    var_3c = 4
    var_38 = 0
    var_34 = 0
    ascensionrules::CreateStateMustPayResources(r9, r0_1, 0, r5, 0, 4, 0, 0)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
else if (r5 s<= *(r7 + 0xb48))
    ascension::CWorld::RemoveCurrentTurnPower(r7)
else
    ascension::CWorld::RemoveCurrentTurnPower(r7)
    ascension::CWorld::RemoveCurrentTurnRunes(r7)

core::CWorldBase::OutputMessageFormat(r7, "%s defeats %s (%d power)\n", r9 + 0x10, 
    (*(*r0_1 + 0xc))(r0_1), r5, var_3c, var_38, var_34)
ascensionrules::CreateStateGainHonor(r9, r0_1, r8[0x29], false, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
ascensionrules::CreateStateProcessDefeatHeroSequence(r9, r0_1, 7, r4, 9, true, false, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
