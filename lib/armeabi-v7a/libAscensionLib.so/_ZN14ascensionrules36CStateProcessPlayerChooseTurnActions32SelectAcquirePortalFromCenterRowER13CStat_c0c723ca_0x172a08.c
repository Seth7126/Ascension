// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions32SelectAcquirePortalFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x172a08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
int32_t r5 = *(r8 + 4)
core::CCardInstance* r0_1 = core::CWorldBase::GetInstanceByID(r5)
int32_t r7 = 0
int32_t result = ascension::CWorld::GetCenterRowCard(r5)

if (result != r0_1)
    r7 = 1
    result = ascension::CWorld::GetCenterRowCard(r5)
    
    if (result != r0_1)
        r7 = 2
        result = ascension::CWorld::GetCenterRowCard(r5)
        
        if (result != r0_1)
            r7 = 3
            result = ascension::CWorld::GetCenterRowCard(r5)
            
            if (result != r0_1)
                r7 = 4
                result = ascension::CWorld::GetCenterRowCard(r5)
                
                if (result != r0_1)
                    r7 = 5
                    result = ascension::CWorld::GetCenterRowCard(r5)
                    
                    if (result != r0_1)
                        result = ascension::CWorld::GetCenterRowCard(r5)
                        r7 = 7
                        
                        if (result == r0_1)
                            r7 = 6

if (r0_1 != 0)
    result = *(arg2 + 0x254)
    
    if (result s>= 1)
        void* __offset(CState, 0x270) r1_8 = arg2 + 0x270
        int32_t r2 = 0
        
        do
            if (*(r1_8 - 0x18) == r0_1)
                if (zx.d(*r1_8) != 0)
                    if (*(r5 + 0xb48) s>= 1)
                        goto label_172b5c
                    
                    ascension::CWorld::RemoveCurrentTurnRunes(r5)
                else if (zx.d(*(r5 + 0xb2b)) == 0 || *(r5 + 0xb48) s< 1)
                    ascension::CWorld::RemoveCurrentTurnRunes(r5)
                else
                label_172b5c:
                    ascensionrules::CreateStateMustPayResources(r8, r0_1, *(r1_8 - 0xc), 0, 0, 0, 
                        2, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                ascensionrules::CreateStateProcessAcquirePortal(r8, r0_1, 7, r7, 3)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r2 += 1
            r1_8 += 0x44
        while (r2 s< result)

return result
