// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow31SelectDefeatTrophyFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x12f6ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r9 = *(arg2 + 0x24c)
int32_t r4 = 0
int32_t r6 = *(r9 + 4)
int32_t result = ascension::CWorld::GetCenterRowCard(r6)

if (result != arg3)
    r4 = 1
    result = ascension::CWorld::GetCenterRowCard(r6)
    
    if (result != arg3)
        r4 = 2
        result = ascension::CWorld::GetCenterRowCard(r6)
        
        if (result != arg3)
            r4 = 3
            result = ascension::CWorld::GetCenterRowCard(r6)
            
            if (result != arg3)
                r4 = 4
                result = ascension::CWorld::GetCenterRowCard(r6)
                
                if (result != arg3)
                    r4 = 5
                    result = ascension::CWorld::GetCenterRowCard(r6)
                    
                    if (result != arg3)
                        result = ascension::CWorld::GetCenterRowCard(r6)
                        r4 = 7
                        
                        if (result == arg3)
                            r4 = 6

if (arg3 == 0)
    return result

core::CWorldBase::OutputMessageFormat(r6, "%s defeats %s\n", r9 + 0x10, (*(*arg3 + 0xc))(arg3))
*(arg2 + r4 + 0x6c4) = 1
*(arg2 + 0x680) += 1
ascensionrules::CreateStateProcessDefeatMonsterSequence(r9, arg3, 7, r4, 5, false, false, false, 
    nullptr, 0)
return CStateMachine::PushState(arg1) __tailcall
