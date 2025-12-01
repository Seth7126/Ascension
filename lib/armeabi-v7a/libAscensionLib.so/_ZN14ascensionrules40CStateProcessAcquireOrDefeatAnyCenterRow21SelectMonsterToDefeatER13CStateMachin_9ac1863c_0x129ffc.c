// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow21SelectMonsterToDefeatER13CStateMachineP6CStateiPj
// 地址: 0x129ffc
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
    core::CWorldBase::OutputMessageFormat(r6, "%s defeats %s\n", r8 + 0x10, *(arg3 + 0xc) + 4)
    
    if (*(r6 + 0x30) u< 2)
        ascensionrules::CreateStateRemoveCenterRowCard(r8, r7, nullptr, true, true, 0, 0, false, 
            nullptr, nullptr, 0, nullptr, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        ascensionrules::CreateStateProcessDefeatMonster(r8, arg3, r7)
    else
        ascensionrules::CreateStateProcessDefeatMonsterSequence(r8, arg3, 7, r7, 9, false, true, 
            false, nullptr, 0)
    
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    result = 1
    *(arg2 + 0xced) = 1

return result
