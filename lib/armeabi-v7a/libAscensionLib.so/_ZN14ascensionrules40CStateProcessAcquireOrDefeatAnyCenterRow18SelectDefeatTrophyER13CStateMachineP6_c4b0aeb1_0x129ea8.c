// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow18SelectDefeatTrophyER13CStateMachineP6CStateiPj
// 地址: 0x129ea8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r8 = *(arg2 + 0x24c)
int32_t r7 = 0
int32_t r6 = *(r8 + 4)
int32_t result = ascension::CWorld::GetCenterRowCard(r6)

if (result != arg3)
    r7 = 1
    result = ascension::CWorld::GetCenterRowCard(r6)
    
    if (result != arg3)
        r7 = 2
        result = ascension::CWorld::GetCenterRowCard(r6)
        
        if (result != arg3)
            r7 = 3
            result = ascension::CWorld::GetCenterRowCard(r6)
            
            if (result != arg3)
                r7 = 4
                result = ascension::CWorld::GetCenterRowCard(r6)
                
                if (result != arg3)
                    r7 = 5
                    result = ascension::CWorld::GetCenterRowCard(r6)
                    
                    if (result != arg3)
                        result = ascension::CWorld::GetCenterRowCard(r6)
                        r7 = 7
                        
                        if (result == arg3)
                            r7 = 6

if (arg3 != 0)
    core::CWorldBase::OutputMessageFormat(r6, "%s defeats %s)\n", r8 + 0x10, (*(*arg3 + 0xc))(arg3))
    ascensionrules::CreateStateProcessDefeatMonsterSequence(r8, arg3, 7, r7, 5, false, true, false, 
        nullptr, 0)
    CState::AddOwnedChild(arg2)
    result = CStateList::AppendState(arg2)
    *(arg2 + 0xced) = 1

return result
