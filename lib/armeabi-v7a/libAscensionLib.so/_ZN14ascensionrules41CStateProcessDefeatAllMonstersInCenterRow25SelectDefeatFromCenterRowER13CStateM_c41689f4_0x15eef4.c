// 函数: _ZN14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow25SelectDefeatFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x15eef4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r9 = *(arg2 + 0x24c)
uint32_t r6 = 0
int32_t r4 = *(r9 + 4)
int32_t result = ascension::CWorld::GetCenterRowCard(r4)

if (result != arg3)
    r6 = 1
    result = ascension::CWorld::GetCenterRowCard(r4)
    
    if (result != arg3)
        r6 = 2
        result = ascension::CWorld::GetCenterRowCard(r4)
        
        if (result != arg3)
            r6 = 3
            result = ascension::CWorld::GetCenterRowCard(r4)
            
            if (result != arg3)
                r6 = 4
                result = ascension::CWorld::GetCenterRowCard(r4)
                
                if (result != arg3)
                    r6 = 5
                    result = ascension::CWorld::GetCenterRowCard(r4)
                    
                    if (result != arg3)
                        result = ascension::CWorld::GetCenterRowCard(r4)
                        r6 = 7
                        
                        if (result == arg3)
                            r6 = 6

if (arg3 == 0)
    return result

core::CWorldBase::OutputMessageFormat(r4, "%s defeats %s\n", r9 + 0x10, (*(*arg3 + 0xc))(arg3))
*(arg2 + r6 + 0x4b4) = 1
*(arg2 + 0x490) += 1
int32_t var_28 = 0
ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
    operator new(0x99c), r9, arg3, 7, r6, true, false, false)
return CStateMachine::PushState(arg1) __tailcall
